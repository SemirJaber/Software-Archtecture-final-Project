package com.example.SA.project.service;

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
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderQueryRepository orderrepository;

    public void placeorder(OrderDTO orderdto) {
        Order order = OrderAdapter.getOrderfromOrderDTO(orderdto);
        orderrepository.save(order);

    }

    public OrderDTO getOrder(long ordernumber) {
        Order order = orderrepository.findById(ordernumber).get();
        OrderDTO orderdto = OrderAdapter.getOrderDTOfromOrder(order);
        return orderdto;

    }


}



