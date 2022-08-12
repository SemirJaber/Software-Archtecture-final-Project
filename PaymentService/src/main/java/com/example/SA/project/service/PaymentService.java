package com.example.SA.project.service;

import com.example.SA.project.Adapter.PaymentAdapter;
import com.example.SA.project.DTOs.OrderDTO;
import com.example.SA.project.DTOs.PaymentDTO;
import com.example.SA.project.domain.Payment;
import com.example.SA.project.kafka.KafkaSender;
import com.example.SA.project.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentrepository;

    @Autowired
    private KafkaSender sender;

    public PaymentDTO getPaymentfromordernumber(long ordernumber){
        Payment payment=paymentrepository.findByordernumber(ordernumber);
        PaymentDTO paymentdto= PaymentAdapter.getPaymentDTOfromPayment(payment);
        return paymentdto;
    }
    public PaymentDTO getPaymentfromcustomernumber(long customernumber){
       Payment payment= paymentrepository.findBycustomernumber(customernumber);
       PaymentDTO paymentdto=PaymentAdapter.getPaymentDTOfromPayment(payment);
       return paymentdto;
    }
//    @KafkaListener(topics={"topicA"})
//    public void addPaymentfromOrder(@Payload OrderDTO orderdto,@Headers MessageHeaders header){
//        PaymentDTO paymentdto=orderdto.getPaymentdto();
//        Payment payment=new Payment(orderdto.getPaymentdto().getPaymentnumber(),orderdto.getOrdernumber(),orderdto.getCustomerdto().getCustomernumber(),orderdto.getDate(),orderdto.getPaymentdto().getAmount());
//
//        paymentrepository.save(payment);
//    }
    public void addPayment(PaymentDTO paymentdto){
        Payment payment=PaymentAdapter.getPaymentfromPaymentDTO(paymentdto);
        paymentrepository.save(payment);
    }
    public void updatePayment(long ordernumber,double amount){
        Payment payment=paymentrepository.findByordernumber(ordernumber);
        payment.setAmount(amount);
        PaymentDTO paydto=PaymentAdapter.getPaymentDTOfromPayment(payment);
        paydto.setAmount(amount);
        sender.send("topicD",paydto);
        paymentrepository.save(payment);
    }
    public void deletePayment(long ordernumber){
       Payment payment= paymentrepository.findByordernumber(ordernumber);
        paymentrepository.delete(payment);
    }
}
