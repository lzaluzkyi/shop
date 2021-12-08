package com.shop.shop.service;

import com.shop.shop.dto.CartDTO;
import com.shop.shop.dto.ProductDTO;
import com.shop.shop.entity.Cart;

public interface CartService {

    CartDTO map(Cart cart);

    Cart map(CartDTO cartDto);

    Cart clearCurrentUserCart();

    Cart addProductToCurrentUserCart(ProductDTO productDTO);

    Cart deleteProductFromCurrentUserCart(ProductDTO productDTO);

    Long getCartPrice(Long id);


}
