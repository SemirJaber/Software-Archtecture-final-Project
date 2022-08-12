package com.example.SA.project.service;

import com.example.SA.project.Adapter.OrderAdapter;
import com.example.SA.project.DTOs.CustomerDTO;
import com.example.SA.project.DTOs.OrderDTO;
import com.example.SA.project.DTOs.PaymentDTO;
import com.example.SA.project.DTOs.ProductDTO;
import com.example.SA.project.Repositories.OrderCommandRepository;
import com.example.SA.project.domain.Customer;
import com.example.SA.project.domain.Order;
import com.example.SA.project.domain.Product;
import com.example.SA.project.kafka.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderCommandRepository orderrepository;
    @Autowired
    private KafkaSender sender;

    public void placeorder(OrderDTO orderdto){
        sender.send("topicA",orderdto);
        Order order=OrderAdapter.getOrderfromOrderDTO(orderdto);
        orderrepository.save(order);
    }
    public OrderDTO getOrder(long ordernumber){
        Order order=orderrepository.findById(ordernumber).get();
        OrderDTO orderdto=OrderAdapter.getOrderDTOfromOrder(order);
        return orderdto;

        }
        @KafkaListener(topics={"topicB"})
    public void updateCustomer(@Payload CustomerDTO customerdto,@Headers MessageHeaders header) {
            Order order = orderrepository.findOrderwithcustomernumber(customerdto.getCustomernumber());
            order.getCustomer().setName(customerdto.getName());
            OrderDTO orderdto=OrderAdapter.getOrderDTOfromOrder(order);
            orderdto.getCustomerdto().setName(customerdto.getName());
            sender.send("customerupdatetoquery",orderdto);
            orderrepository.save(order);
        }
        @KafkaListener(topics={"topicC"})
    public void updateProduct(@Payload ProductDTO productdto,@Headers MessageHeaders header){
        Order order= orderrepository.findOrderwithproductnumber(productdto.getProductnumber());
        order.getProduct().setPrice(productdto.getPrice());
        OrderDTO orderdto=OrderAdapter.getOrderDTOfromOrder(order);
        sender.send("productupdatetoquery",orderdto);
        orderrepository.save(order);

            }

    @KafkaListener(topics={"topicD"})
    public void updatePayment(@Payload PaymentDTO paydto,@Headers MessageHeaders header) {
        Order order = orderrepository.findOrderwithpaymentnumber(paydto.getPaymentdtoid());
        order.getProduct().setPrice(paydto.getAmount());
        orderrepository.save(order);
    }

    }




