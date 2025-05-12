package com.digitalstore.imperium.library.service;

import com.digitalstore.imperium.library.dto.CustomerDto;
import com.digitalstore.imperium.library.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> listAll();

    CustomerDto save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer saveInfor(Customer customer);

    double calculateDiscount(double amount);
}
