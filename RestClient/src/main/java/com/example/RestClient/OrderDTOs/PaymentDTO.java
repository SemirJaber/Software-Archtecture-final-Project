package com.example.RestClient.OrderDTOs;


public class PaymentDTO {
    private double amount;
    public PaymentDTO(){}

    public PaymentDTO(double amount) {

        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
