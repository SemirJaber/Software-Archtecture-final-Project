package com.example.SA.project.Adapter;

import com.example.SA.project.DTOs.PaymentDTO;
import com.example.SA.project.domain.Payment;

public class PaymentAdapter {

    public static Payment getPaymentfromPaymentDTO(PaymentDTO paymentdto){
        Payment payment=
                new Payment(paymentdto.getPaymentnumber(),paymentdto.getOrdernumber(),paymentdto.getCustomernumber(),paymentdto.getDate(),paymentdto.getAmount());
        return payment;
    }
    public static PaymentDTO getPaymentDTOfromPayment(Payment payment){
        PaymentDTO paymentdto=
                new PaymentDTO(payment.getPaymentnumber(),payment.getOrdernumber(),payment.getCustomernumber(),payment.getDate(),payment.getAmount());
        return paymentdto;
    }
}
