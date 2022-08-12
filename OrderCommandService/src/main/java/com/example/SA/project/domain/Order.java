package com.example.SA.project.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document
public class Order {
    @Id
    private long ordernumber;

    private String date;
    private int quantity;
    private Customer customer;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    private Product product;

    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }
    public Order(){}

    public Order(long ordernumber, String date, int quantity) {
        this.ordernumber = ordernumber;
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public long getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(long ordernumber) {
        this.ordernumber = ordernumber;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
