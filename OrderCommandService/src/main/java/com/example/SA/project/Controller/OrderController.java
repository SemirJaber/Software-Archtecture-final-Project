package com.example.SA.project.Controller;

import com.example.SA.project.DTOs.OrderDTO;
import com.example.SA.project.kafka.KafkaSender;
import com.example.SA.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderservice;

    @PostMapping("/order")
    public ResponseEntity<?> createOrder(@RequestBody OrderDTO orderdto){
        orderservice.placeorder(orderdto);
      //  sender.send("topicA",orderdto);
        return new ResponseEntity<OrderDTO>(orderdto, HttpStatus.OK);


    }
    @GetMapping("/order/{ordernumber}")
    public ResponseEntity<?> getOrder(@PathVariable long ordernumber){
        OrderDTO orderdto=orderservice.getOrder(ordernumber);
        return new ResponseEntity<OrderDTO>(orderdto, HttpStatus.OK);
    }


}
