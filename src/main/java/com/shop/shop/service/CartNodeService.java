package com.shop.shop.service;

import com.shop.shop.dto.CartNodeDTO;
import com.shop.shop.entity.Cart;
import com.shop.shop.entity.CartNode;

import java.util.List;

public interface CartNodeService {

    void deleteAll(List<CartNode> cartNodes);

    CartNode update(CartNode cartNode);

    CartNode addOneProduct(CartNode cartNode);

    void deleteOneProduct(CartNode cartNode);

    CartNode create(CartNodeDTO cartNodeDTO);

    CartNodeDTO map(CartNode cartNode);

    CartNode map(CartNodeDTO cartNodeDTO);

    CartNode getByCartAndProduct(Long productId , Cart cart);

    CartNode save(CartNode cartNode);

    Long getCartNodePriceBy(CartNode cartNode);
    Long getCartNodePriceById(Long cartNodeId);

}
