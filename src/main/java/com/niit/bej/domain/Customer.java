/*
 * Author Name: Mohit Saini
 * Date: 01-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.niit.bej.domain;

public class Customer {

    private int id;
    private String name;

    private String products;

    private long phoneNo;

    private Product product;

    public Customer(int id, String name, String products, long phoneNo, Product product) {
        this.id = id;
        this.name = name;
        this.products = products;
        this.phoneNo = phoneNo;
        this.product = product;
    }

    public Customer() {
    }
}
