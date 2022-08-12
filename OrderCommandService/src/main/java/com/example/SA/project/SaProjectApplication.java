package com.example.SA.project;

import com.example.SA.project.DTOs.CustomerDTO;
import com.example.SA.project.DTOs.OrderDTO;
import com.example.SA.project.DTOs.PaymentDTO;
import com.example.SA.project.DTOs.ProductDTO;
import com.example.SA.project.kafka.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableKafka
@EnableFeignClients
@EnableEurekaClient
public class SaProjectApplication implements CommandLineRunner {
	@Autowired
	private KafkaSender kafkasender;

	RestTemplate template=new RestTemplate();

	String server="http://localhost:6004/order";

	public static void main(String[] args) {
		SpringApplication.run(SaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("------------------------creatorder---------------------");
		OrderDTO orderdto=new OrderDTO(0001,"01/02/2022",20);
		ProductDTO productdto1=new ProductDTO(0001,"Corolla",30000);
		CustomerDTO customerdto=new CustomerDTO(1234,"Semir");
		PaymentDTO paymentdto=new PaymentDTO(30,30000);
		orderdto.setProductdto(productdto1);
		orderdto.setCustomerdto(customerdto);
		orderdto.setPaymentdto(paymentdto);

		template.postForLocation(server,orderdto,OrderDTO.class);
//
//
//
//		OrderDTO orderdto1=new OrderDTO(0002,"01/02/2021",40);
//		ProductDTO productdto2=new ProductDTO(0001,"Nissan",40000);
//		CustomerDTO customerdto1=new CustomerDTO(5432,"mire");
//		PaymentDTO paymentdto1=new PaymentDTO(0005,40000);
//		orderdto1.setProductdto(productdto2);
//		orderdto1.setCustomerdto(customerdto1);
//		orderdto1.setPaymentdto(paymentdto1);
//
//
//		template.postForLocation(server,orderdto1,OrderDTO.class);
//
//		System.out.println(orderdto);
//
//
//
//		System.out.println("-------------------------getOrder--------------------------");
//
//		OrderDTO orderdto2=template.getForObject(server+"/{ordernumber}",OrderDTO.class,0001);
//               System.out.println(orderdto);

	}
}
