package com.example.SA.project.DTOs;


public class CustomerDTO {

    private long customernumber;
    private String name;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customernumber=" + customernumber +
                ", name='" + name + '\'' +
                '}';
    }

    public CustomerDTO(){}

    public CustomerDTO(long customernumber, String name) {
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
