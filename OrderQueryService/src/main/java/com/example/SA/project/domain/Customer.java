package com.example.SA.project.domain;


public class Customer {

    private long customernumber;
    private String name;
    public Customer(){}

    public Customer(long customernumber, String name) {
        this.customernumber = customernumber;
        this.name = name;

    }

    public long getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(long customernumber) {
        this.customernumber = customernumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
