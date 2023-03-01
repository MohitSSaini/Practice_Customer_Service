/*
 * Author Name: Mohit Saini
 * Date: 01-03-2023
 * Created With: IntelliJ IDEA Ultimate
 */
package com.niit.bej.domain;

import java.util.Objects;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && phoneNo == customer.phoneNo && Objects.equals(name, customer.name) && Objects.equals(products, customer.products) && Objects.equals(product, customer.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, products, phoneNo, product);
    }
}
