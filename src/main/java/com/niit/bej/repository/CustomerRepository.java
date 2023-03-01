/*
 * Author Name: Mohit Saini
 * Date: 01-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.niit.bej.repository;

import com.niit.bej.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    //    Optional<Customer>findById(int id);
    @Query("{'product.name': ?0}")
    List<Customer> fetchAllCustomerByProductName(String name);
}
