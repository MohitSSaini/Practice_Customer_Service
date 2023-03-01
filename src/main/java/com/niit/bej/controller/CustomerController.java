/*
 * Author Name: Mohit Saini
 * Date: 01-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.niit.bej.controller;

import com.niit.bej.domain.Customer;
import com.niit.bej.exception.CustomerAlreadyExist;
import com.niit.bej.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    public final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
        try {
            Customer insertedcustomer = customerService.addCustomer(customer);
            return new ResponseEntity<>(insertedcustomer, HttpStatus.CREATED);
        } catch (CustomerAlreadyExist exception) {
            return new ResponseEntity<>(exception, HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/getCustomer")
    public ResponseEntity<?> getCustomer() {
        try {
            List<Customer> customerList = customerService.getAllCustomer();
            return new ResponseEntity<>(customerList, HttpStatus.FOUND);
        } catch (Exception exception) {
            return new ResponseEntity<>(exception, HttpStatus.CONFLICT);
        }
    }
}
