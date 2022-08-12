package com.example.SA.project;

import com.example.SA.project.DTOs.ProductDTO;
import com.example.SA.project.DTOs.SupplierDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class SaProjectApplication implements CommandLineRunner {

	RestTemplate template=new RestTemplate();
	String server="http://localhost:6003/products";

	public static void main(String[] args) {
		SpringApplication.run(SaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("---------------------------addProduct---------------------");
		ProductDTO productdto=new ProductDTO(1000,"Corolla",30000);
		SupplierDTO supplier=new SupplierDTO("Toyota","5109786654");
		productdto.setSupplierdto(supplier);
		template.postForLocation(server,productdto,ProductDTO.class);

		ProductDTO productdto1=new ProductDTO(2000,"Infinity",40000);
		SupplierDTO supplier1=new SupplierDTO("Nissan","5438799621");

		productdto.setSupplierdto(supplier1);
		template.postForLocation(server,productdto1,ProductDTO.class);

		ProductDTO productdto2=new ProductDTO(3000,"Accord",35000);
		SupplierDTO supplier2=new SupplierDTO("Honda","513298654");

		productdto.setSupplierdto(supplier2);
		template.postForLocation(server,productdto2,ProductDTO.class);


		System.out.println("--------------------------getProduct---------------------");

		ProductDTO productdto3=template.getForObject(server+"/{productnumber}",ProductDTO.class,2000);

		System.out.println(productdto3);

	}
}
