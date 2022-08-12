package com.example.RestClient.OrderDTOs;

public class OrderDTO {
    private long ordernumber;
    private String date;
    private int quantity;

    public CustomerDTOs getCustomerdto() {
        return customerdto;
    }

    public PaymentDTO getPaymentdto() {
        return paymentdto;
    }

    public void setPaymentdto(PaymentDTO paymentdto) {
        this.paymentdto = paymentdto;
    }

    public void setCustomerdto(CustomerDTOs customerdto) {
        this.customerdto = customerdto;
    }

    private CustomerDTOs customerdto;
    private ProductDTOs productdto;

    public ProductDTOs getProductdto() {
        return productdto;
    }

    public void setProductdto(ProductDTOs productdto) {
        this.productdto = productdto;
    }

    private PaymentDTO paymentdto;



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
