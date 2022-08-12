package com.example.SA.project.DTOs;


public class PaymentDTO {
    private long paymentdtoid;
    private double amount;

    public long getPaymentdtoid() {
        return paymentdtoid;
    }

    public void setPaymentdtoid(long paymentdtoid) {
        this.paymentdtoid = paymentdtoid;
    }

    public PaymentDTO(){}

    public PaymentDTO(long paymentdtoid, double amount) {
        this.paymentdtoid = paymentdtoid;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
