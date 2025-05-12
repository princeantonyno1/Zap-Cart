package com.digitalstore.imperium.library.service;

import com.digitalstore.imperium.library.model.Order;
import com.digitalstore.imperium.library.model.ShoppingCart;

import java.util.List;

public interface OrderService {
    List<Order> listAll();
    Order get(long id);
    void saveOrder(ShoppingCart cart);
    void acceptOrder(Long id);
    void cancelOrder(Long id);
    void updatePayment(Order order);
}
