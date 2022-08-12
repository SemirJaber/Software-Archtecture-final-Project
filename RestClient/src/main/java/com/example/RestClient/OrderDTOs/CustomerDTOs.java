package com.example.RestClient.OrderDTOs;


public class CustomerDTOs {

    private long customernumber;
    private String name;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customernumber=" + customernumber +
                ", name='" + name + '\'' +
                '}';
    }

    public CustomerDTOs(){}

    public CustomerDTOs(long customernumber, String name) {
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
