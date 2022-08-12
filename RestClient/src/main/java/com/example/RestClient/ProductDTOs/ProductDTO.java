package com.example.RestClient.ProductDTOs;



public class ProductDTO {
    private long productnumber;
    private String name;
    private double price;
    private SupplierDTO supplierdto;

    public ProductDTO(){}

    public ProductDTO(long productnumber, String name, double price) {
        this.productnumber = productnumber;
        this.name = name;
        this.price = price;
    }

    public long getProductnumber() {
        return productnumber;
    }

    public SupplierDTO getSupplierdto(){
        return supplierdto;
    }

    public void setSupplierdto(SupplierDTO supplier) {
        this.supplierdto = supplier;
    }

    public void setProductnumber(long productnumber) {
        this.productnumber = productnumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productnumber=" + productnumber +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", supplier=" + supplierdto +
                '}';
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
