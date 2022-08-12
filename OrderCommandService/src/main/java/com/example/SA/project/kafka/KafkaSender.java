package com.example.SA.project.kafka;

import com.example.SA.project.DTOs.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
@Autowired
private KafkaTemplate<String,OrderDTO> kafkatemplate;


public void send(String topic,OrderDTO orderdto){
    kafkatemplate.send(topic,orderdto);
}

}
