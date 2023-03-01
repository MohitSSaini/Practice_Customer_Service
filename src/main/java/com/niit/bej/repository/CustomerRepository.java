/*
 * Author Name: Mohit Saini
 * Date: 01-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.niit.bej.repository;

import com.niit.bej.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
}
