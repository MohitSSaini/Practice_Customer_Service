/*
 * Author Name: Mohit Saini
 * Date: 01-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.niit.bej.controller;

import com.niit.bej.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    public final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
}
