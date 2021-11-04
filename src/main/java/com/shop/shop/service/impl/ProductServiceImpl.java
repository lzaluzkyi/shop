package com.shop.shop.service.impl;

import com.shop.shop.dto.CategoryDTO;
import com.shop.shop.dto.ProductDTO;
import com.shop.shop.entity.Category;
import com.shop.shop.entity.Product;
import com.shop.shop.repository.ProductRepository;
import com.shop.shop.service.CategoryService;
import com.shop.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;
    private CategoryService categoryService;

    @Autowired
    public ProductServiceImpl(ProductRepository repository, CategoryService categoryService) {
        this.repository = repository;
        this.categoryService = categoryService;
    }

    @Override
    public Product getOne(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Product> getAllByCategories(List<CategoryDTO> categories) {
        List<Category> collect = categories
                .stream()
                .map(categoryDTO -> categoryService.map(categoryDTO))
                .collect(Collectors.toList());
        return repository.getAllByCategoryIn(collect);
    }

    @Override
    public Product create(ProductDTO productDTO) {
        Product product = map(productDTO);
        return repository.save(product);
    }

    @Override
    public Product update(ProductDTO productDTO) {
        if (productDTO.getId() == null){
            // TODO: 04.11.2021 add custom exception
            throw new IllegalArgumentException("Id cant be null");
        }
        Product product = map(productDTO);
        return repository.save(product);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Product map(ProductDTO productDTO) {
        Product product = new Product();
        product.setCapacity(productDTO.getCapacity());
        product.setDescription(productDTO.getDescription());
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        Category category = categoryService.getOne(productDTO.getCategory().getId());
        product.setCategory(category);

        return product;
    }

    @Override
    public ProductDTO map(Product product) {
        ProductDTO productDTO = new ProductDTO(product);
        return productDTO;
    }
}
