package com.digitalstore.imperium.library.service;

import com.digitalstore.imperium.library.model.Customer;
import com.digitalstore.imperium.library.model.Product;
import com.digitalstore.imperium.library.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(Product product, int quantity, Customer customer);

    ShoppingCart updateItemInCart(Product product, int quantity, Customer customer);

    ShoppingCart deleteItemFromCart(Product product, Customer customer);

}
