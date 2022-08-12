package com.example.RestClient;

import com.example.RestClient.CustomerDTOs.AddressDTO;
import com.example.RestClient.CustomerDTOs.ContactDTO;
import com.example.RestClient.CustomerDTOs.CustomerDTO;
import com.example.RestClient.OrderDTOs.CustomerDTOs;
import com.example.RestClient.OrderDTOs.OrderDTO;
import com.example.RestClient.OrderDTOs.ProductDTOs;
import com.example.RestClient.OrderDTOs.PaymentDTO;
import com.example.RestClient.ProductDTOs.ProductDTO;
import com.example.RestClient.ProductDTOs.SupplierDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication implements CommandLineRunner {

	RestTemplate template=new RestTemplate();


	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String gatewayserver="http://localhost:8090";
		String customerserver="http://localhost:6001/customers";
		String productserver="http://localhost:6003/products";
		String orderserver="http://localhost:6004/order";
		String paymentserver="http://localhost:6002/payments";


//		System.out.println("-----------------------------------------------adding Customer---------------------------------------------------");
//
//		ContactDTO contactdto=new ContactDTO("09876543","abcs@gmail.com");
//		AddressDTO addressdto=new AddressDTO("4th","fairfield","52556");
//		CustomerDTO customerdto=new CustomerDTO(1234,"semir");
//		customerdto.setAddressdto(addressdto);
//		customerdto.setContactdto(contactdto);
//		template.postForLocation(gatewayserver+"/customers",customerdto,CustomerDTO.class);
//
//
//
//
//		System.out.println("--------------------------------------------------------addProducts---------------------------------------------------");
//
//		ProductDTO productdto=new ProductDTO(1000,"Corolla",30000);
//		SupplierDTO supplier=new SupplierDTO("Toyota","5109786654");
//		productdto.setSupplierdto(supplier);
//		template.postForLocation(gatewayserver+"/products",productdto,ProductDTO.class);
//
//		ProductDTO productdto1=new ProductDTO(2000,"Infinity",40000);
//		SupplierDTO supplier1=new SupplierDTO("Nissan","5438799621");
//
//		productdto.setSupplierdto(supplier1);
//		template.postForLocation(gatewayserver+"/products",productdto1,ProductDTO.class);

//
//
//
//		System.out.println("---------------------------------------------------creatorder----------------------------------------------------");
//		OrderDTO orderdto=new OrderDTO(0001,"01/02/2022",20);
//		ProductDTOs product=new ProductDTOs(0001,"Corolla",30000);
//		CustomerDTOs customer=new CustomerDTOs(1234,"Semir");
//		PaymentDTO paymentdto=new PaymentDTO(30000);
//		orderdto.setProductdto(product);
//		orderdto.setCustomerdto(customer);
//		orderdto.setPaymentdto(paymentdto);
//
//
//		template.postForLocation(gatewayserver+"/order",orderdto,OrderDTO.class);
////
//

//		System.out.println("--------------------------------------------------getOrder-----------------------------------------------------------");
//
//		OrderDTO orderdto2=template.getForObject(gatewayserver+"/orders/{ordernumber}",OrderDTO.class,0001);
//		System.out.println(orderdto2);
//
//
//		System.out.println("--------------------------------------------------updateProductname-----------------------------------------------------------");
//		ProductDTO productdto2=template.getForObject(gatewayserver+"/products"+"/{productnumber}",ProductDTO.class,1000);
//		productdto2.setPrice(4000);
//		template.put(gatewayserver+"/products/{price}",productdto2,4000);
//		System.out.println(productdto2);
//
//
//
//		System.out.println("--------------------------------------------------updateCustomername-----------------------------------------------------------");
//		CustomerDTO customername=template.getForObject(gatewayserver+"/customers"+"/{customernumber}",CustomerDTO.class,1234);
//		customername.setName("semir");
//		template.put(gatewayserver+"/customers/{name}",customername,"semir");
//		System.out.println(customername);

//
//		System.out.println("--------------------------------------------------updatepayment-----------------------------------------------------------");
//		PaymentDTO paymentupdate=template.getForObject(gatewayserver+"/payments/order/{ordernumber}",PaymentDTO.class,1);
//		paymentupdate.setAmount(40000);
//		template.put(gatewayserver+"/payments/{ordernumber}/{amount}",paymentupdate,1,40000);
//		System.out.println(paymentupdate);




	}
}

