package com.digitalstore.imperium.admin.controller;

import com.digitalstore.imperium.library.model.Customer;
import com.digitalstore.imperium.library.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/customers")
    public String getCustomers(Model model, Principal principal) {

        if (principal == null)
            return "redirect:/login";

        List<Customer> customers = customerService.listAll();
        model.addAttribute("customers", customers);
        model.addAttribute("title", "All Customers");
        model.addAttribute("size", customers.size());

        return "customers";
    }


}
