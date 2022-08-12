package com.example.SA.project.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Payment {
    @Id
    private long paymentnumber;
    private long ordernumber;
    private long customernumber;
    private String date;
    private double amount;

    public long getPaymentnumber() {
        return paymentnumber;
    }

    public Payment(){}

    public Payment(long paymentnumber,long ordernumber, long customernumber, String date, double amount) {
        this.paymentnumber=paymentnumber;
        this.ordernumber = ordernumber;
        this.customernumber = customernumber;
        this.date = date;
        this.amount = amount;
    }

    public long getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(long ordernumber) {
        this.ordernumber = ordernumber;
    }

    public long getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(long customernumber) {
        this.customernumber = customernumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
