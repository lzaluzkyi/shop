package com.shop.shop.service;

import com.shop.shop.entity.Cart;
import com.shop.shop.entity.CartNode;
import com.shop.shop.repository.CartRepository;
import com.shop.shop.service.impl.CartServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CartServiceTest {
    CartService cartService;
    CartNodeService cartNodeService;
    CartRepository cartRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;


    @Test
    void getCartPrice() {
        cartRepository = Mockito.mock(CartRepository.class);
        Mockito.when(cartRepository.getOne(Mockito.anyLong())).thenReturn(createCart());

        cartNodeService = Mockito.mock(CartNodeService.class);
        Mockito.when(cartNodeService.getCartNodePriceById(Mockito.anyLong())).thenReturn(5L);
        
        cartService = new CartServiceImpl(userService , cartNodeService , cartRepository, productService);

        Long cartPrice = cartService.getCartPrice(1L);
        assertEquals(15 , cartPrice);

    }

    private Cart createCart(){

        Cart cart = new Cart();
        cart.setCartNodes(new ArrayList<>());
        cart.getCartNodes().add(new CartNode());
        cart.getCartNodes().add(new CartNode());
        cart.getCartNodes().add(new CartNode());;
        return cart;
    }

}