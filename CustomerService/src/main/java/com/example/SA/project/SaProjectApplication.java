package com.example.SA.project;

import com.example.SA.project.DTOs.AddressDTO;
import com.example.SA.project.DTOs.ContactDTO;

import com.example.SA.project.DTOs.CustomerDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableKafka
public class SaProjectApplication implements CommandLineRunner {


	RestTemplate template=new RestTemplate();

	String server="http://localhost:6001/customers";

	public static void main(String[] args) {
		SpringApplication.run(SaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		System.out.println("--------------adding Customers---------------------------------");
//
//		ContactDTO contactdto=new ContactDTO("09876543","abcs@gmail.com");
//		AddressDTO addressdto=new AddressDTO("4th","fairfield","52556");
//		CustomerDTO customerdto=new CustomerDTO(1234,"semir");
//		customerdto.setAddressdto(addressdto);
//		customerdto.setContactdto(contactdto);
//		template.postForLocation(server,customerdto,CustomerDTO.class);
//
//		ContactDTO contactdto1=new ContactDTO("1234567","shewit@gmail.com");
//		AddressDTO addressdto1=new AddressDTO("5th","Alameda","90153");
//		CustomerDTO customerdto1=new CustomerDTO(1987,"shewit");
//		customerdto1.setAddressdto(addressdto1);
//		customerdto1.setContactdto(contactdto1);
//		template.postForLocation(server,customerdto1,CustomerDTO.class);
//
//
//		ContactDTO contactdto2=new ContactDTO("5432187","abcs@gmail.com");
//		AddressDTO addressdto2=new AddressDTO("6th","Ottomwa","50897");
//		CustomerDTO customerdto2=new CustomerDTO(5432,"mire");
//		customerdto2.setAddressdto(addressdto2);
//		customerdto2.setContactdto(contactdto2);
//		template.postForLocation(server,customerdto2,CustomerDTO.class);
//
//        System.out.println("-------------------get Customer------------------");
//
//		CustomerDTO customer1=template.getForObject(server+"/{customernumber}",CustomerDTO.class,1987);
//		System.out.println(customer1);
//
//
		System.out.println("-----------------updateCustomer------------------");

		CustomerDTO customer2=template.getForObject(server+"/{customernumber}",CustomerDTO.class,1234);
		customer2.setName("senay");
		template.put(server+"/{name}",customer2,"senay");
		System.out.println(customer2);
////
//
//		System.out.println("----------------delete customer-----------------------");
//
//
//		template.delete(server+"/{customernumber}",1987);


	}
}
