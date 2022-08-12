package com.example.SA.project.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    @Id
    private long productnumber;
    private String name;
    private double price;
    private Supplier supplier;
    public Product(){}

    public Product(long productnumber, String name, double price) {
        this.productnumber = productnumber;
        this.name = name;
        this.price = price;
    }

    public long getProductnumber() {
        return productnumber;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setProductnumber(long productnumber) {
        this.productnumber = productnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
