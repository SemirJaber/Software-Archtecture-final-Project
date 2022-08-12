package com.example.SA.project.kafka;

import com.example.SA.project.DTOs.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String, CustomerDTO> template;

    public void send(String topic,CustomerDTO customer){
        template.send(topic,customer);
    }

}
