package com.example.SA.project;

import com.example.SA.project.DTOs.PaymentDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableKafka
public class SaProjectApplication implements CommandLineRunner {

	RestTemplate template=new RestTemplate();

	String server="http://localhost:6002/payments";

	public static void main(String[] args) {
		SpringApplication.run(SaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		System.out.println("----------------------addPayment-------------------------");
//		PaymentDTO paymentdto=new PaymentDTO(30,0001,1234,"01/01/2022",2000);
//		 template.postForLocation(server,paymentdto,PaymentDTO.class);
//
//		PaymentDTO paymentdto1=new PaymentDTO(40,0002,5432,"03/01/2022",3000);
//		template.postForLocation(server,paymentdto1,PaymentDTO.class);
//
//		PaymentDTO paymentdto2=new PaymentDTO(50,0003,1987,"06/01/2022",4000);
//		template.postForLocation(server,paymentdto2,PaymentDTO.class);
//
//
//        System.out.println("---------------------------get Payment-----------------------");
//
//		PaymentDTO paymentdtofromordernumber=template.getForObject(server+"/order/{ordernumber}",PaymentDTO.class,1);
//		System.out.println(paymentdtofromordernumber);
//
//		PaymentDTO paymentdtofromcustomernumber=template.getForObject(server+"/customer/{customernumber}",PaymentDTO.class,5432);
//		System.out.println(paymentdtofromcustomernumber);
//

		System.out.println("-------------------update Payment ------------------------");

		PaymentDTO paymentdto3=template.getForObject(server+"/order/{ordernumber}",PaymentDTO.class,1);
		paymentdto3.setAmount(4500);
		template.put(server+"/{ordernumber}/{amount}",paymentdto3,1,4500);
		System.out.println(paymentdto3);

//		System.out.println("---------------------delete payment------------------------");
//		template.delete(server+"/{ordernumber}",1);

	}
}
