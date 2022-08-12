package com.example.SA.project.DTOs;

public class PaymentDTO {
    private long paymentnumber;
    private long ordernumber;
    private long customernumber;
    private String date;
    private double amount;
    public PaymentDTO(){}

    public PaymentDTO(long paymentnumber,long ordernumber, long customernumber, String date, double amount) {
        this.paymentnumber=paymentnumber;
        this.ordernumber = ordernumber;
        this.customernumber = customernumber;
        this.date = date;
        this.amount = amount;
    }

    public long getPaymentnumber() {
        return paymentnumber;
    }

    public void setPaymentnumber(long paymentnumber) {
        this.paymentnumber = paymentnumber;
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

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "ordernumber=" + ordernumber +
                ", customernumber=" + customernumber +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                '}';
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
