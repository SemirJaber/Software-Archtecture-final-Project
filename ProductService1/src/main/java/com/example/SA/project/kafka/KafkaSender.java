package com.example.SA.project.kafka;


import com.example.SA.project.DTOs.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String, ProductDTO> template;

    public void send(String topic,ProductDTO productdto){
        template.send(topic,productdto);
    }

}
