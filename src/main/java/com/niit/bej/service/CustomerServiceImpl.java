/*
 * Author Name: Mohit Saini
 * Date: 01-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.niit.bej.service;

import com.niit.bej.domain.Customer;
import com.niit.bej.exception.CustomerAlreadyExist;
import com.niit.bej.exception.CustomerNotFound;
import com.niit.bej.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) throws CustomerAlreadyExist {
        if (customerRepository.findById(customer.getId()).isPresent()) throw new CustomerAlreadyExist();
        else return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() throws CustomerNotFound {
        List<Customer> customerList = customerRepository.findAll();
        if (customerList.isEmpty()) throw new CustomerNotFound();
        else
            return customerList;
    }

    @Override
    public boolean deleteCustomerById(int id) throws CustomerNotFound {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isEmpty()) {
            customerRepository.deleteById(id);
            throw new CustomerNotFound();
        } else
            customerRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Customer> getAllCustomerByProductName(String name) throws CustomerNotFound {
        List<Customer> customerList = customerRepository.fetchAllCustomerByProductName(name);
        if (customerList.isEmpty())
            throw new CustomerNotFound();
        else
            return customerList;
    }
}
