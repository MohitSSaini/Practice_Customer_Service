package com.niit.bej.service;

import com.niit.bej.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer);

    List<Customer> getAllCustomer();

    boolean deleteCustomerById(int id);

    List<Customer> getAllCustomerByProductName(String name);
}
