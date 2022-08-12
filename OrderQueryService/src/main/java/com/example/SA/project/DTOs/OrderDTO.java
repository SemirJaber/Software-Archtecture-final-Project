package com.example.SA.project.DTOs;

public class OrderDTO {
    private long ordernumber;
    private String date;
    private int quantity;

    public CustomerDTO getCustomerdto() {
        return customerdto;
    }

    public PaymentDTO getPaymentdto() {
        return paymentdto;
    }

    public void setPaymentdto(PaymentDTO paymentdto) {
        this.paymentdto = paymentdto;
    }

    public void setCustomerdto(CustomerDTO customerdto) {
        this.customerdto = customerdto;
    }

    private CustomerDTO customerdto;
    private ProductDTO productdto;
    private PaymentDTO paymentdto;

    public ProductDTO getProductdto() {
        return productdto;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "ordernumber=" + ordernumber +
                ", date='" + date + '\'' +
                ", quantity=" + quantity +
                ", customerdto=" + customerdto +
                ", productdto=" + productdto +
                '}';
    }

    public void setProductdto(ProductDTO productdto) {
        this.productdto = productdto;
    }

    public OrderDTO(){}


    public OrderDTO(long ordernumber, String date,int quantity) {
        this.ordernumber = ordernumber;
        this.date = date;
        this.quantity = quantity;
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
