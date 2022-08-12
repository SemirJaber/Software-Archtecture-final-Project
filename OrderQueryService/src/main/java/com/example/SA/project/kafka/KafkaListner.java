package com.example.SA.project.kafka;

import com.example.SA.project.Adapter.OrderAdapter;
import com.example.SA.project.DTOs.CustomerDTO;
import com.example.SA.project.DTOs.OrderDTO;
import com.example.SA.project.DTOs.ProductDTO;
import com.example.SA.project.Repositories.OrderQueryRepository;
import com.example.SA.project.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {
    @Autowired
    private OrderQueryRepository repository;

@KafkaListener(topics={"topicA"})
    public void listen(@Payload  OrderDTO orderdto, @Headers MessageHeaders header){
    Order order= OrderAdapter.getOrderfromOrderDTO(orderdto);
    repository.save(order);
    System.out.println(orderdto);

}
    @KafkaListener(topics = {"customerupdatetoquery"})
    public void updateCustomer(@Payload CustomerDTO customerdto, @Headers MessageHeaders header) {
        Order order = repository.findOrderwithcustomernumber(customerdto.getCustomernumber());
        order.getCustomer().setName(customerdto.getName());
        repository.save(order);
    }

    @KafkaListener(topics = {"productupdatetoquery"})
    public void updateProduct(@Payload ProductDTO productdto, @Headers MessageHeaders header) {
        Order order = repository.findOrderwithproductnumber(productdto.getProductnumber());
        order.getProduct().setPrice(productdto.getPrice());
        repository.save(order);

    }
}
