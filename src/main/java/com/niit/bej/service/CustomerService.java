package com.niit.bej.service;

import com.niit.bej.domain.Customer;
import com.niit.bej.exception.CustomerAlreadyExist;
import com.niit.bej.exception.CustomerNotFound;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer) throws CustomerAlreadyExist;

    List<Customer> getAllCustomer() throws CustomerNotFound;

    boolean deleteCustomerById(int id) throws CustomerNotFound;

    List<Customer> getAllCustomerByProductName(String name) throws CustomerNotFound;
}
