package com.example.SA.project.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Product {

    private long productnumber;
    private String name;
    private double price;

    public Product(){}

    public Product(long productnumber, String name, double price) {
        this.productnumber = productnumber;
        this.name = name;
        this.price = price;
    }

    public long getProductnumber() {
        return productnumber;
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
