package com.example.RestClient.OrderDTOs;


public class ProductDTOs {

    private long productnumber;
    private String name;
    private double price;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productnumber=" + productnumber +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public ProductDTOs(){}

    public ProductDTOs(long productnumber, String name, double price) {
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
