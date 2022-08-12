package com.example.SA.project.Controller;

import com.example.SA.project.DTOs.PaymentDTO;
import com.example.SA.project.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentservice;
    @GetMapping("/payments/order/{ordernumber}")
    public ResponseEntity<?> getPaymentfromordernumber(@PathVariable long ordernumber){
        PaymentDTO paymentdto=paymentservice.getPaymentfromordernumber(ordernumber);
        paymentservice.getPaymentfromordernumber(ordernumber);
        return new ResponseEntity<PaymentDTO>(paymentdto, HttpStatus.OK);
    }
    @GetMapping("/payments/customer/{customernumber}")
    public ResponseEntity<?> getPaymentfromcustomernumber(@PathVariable long customernumber){
        PaymentDTO paymentdto=paymentservice.getPaymentfromcustomernumber(customernumber);
        return new ResponseEntity<PaymentDTO>(paymentdto, HttpStatus.OK);
    }
    @PostMapping("/payments")
    public ResponseEntity<?> addPayment(@RequestBody PaymentDTO paymentdto){
        paymentservice.addPayment(paymentdto);
        return new ResponseEntity<PaymentDTO>(paymentdto,HttpStatus.OK);
    }
    @PutMapping("/payments/{ordernumber}/{amount}")
    public ResponseEntity<?> updatePayment(@PathVariable long ordernumber,@PathVariable double amount){
        paymentservice.updatePayment(ordernumber,amount);
       PaymentDTO paymentdto= paymentservice.getPaymentfromordernumber(ordernumber);
        return new ResponseEntity<PaymentDTO>(paymentdto,HttpStatus.OK);
    }
    @DeleteMapping("/payments/{ordernumber}")
    public ResponseEntity<?> deletePayment(@PathVariable long ordernumber){
        PaymentDTO paymentdto=paymentservice.getPaymentfromordernumber(ordernumber);
        paymentservice.deletePayment(ordernumber);
        return new ResponseEntity<PaymentDTO>(paymentdto,HttpStatus.OK);
    }

}
