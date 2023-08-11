package com.system.trinity.service;

import com.system.trinity.dto.CartDto;
import com.system.trinity.entity.Cart;

import java.util.List;

public interface CartService {

    void add(CartDto cartDto);

    List<Cart> getCartByActiveUser( );

    void delete(int id);

    void edit(CartDto cartDto);
}
