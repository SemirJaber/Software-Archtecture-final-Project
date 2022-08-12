package com.example.SA.project.Adapter;

import com.example.SA.project.DTOs.CustomerDTO;
import com.example.SA.project.DTOs.OrderDTO;
import com.example.SA.project.DTOs.PaymentDTO;
import com.example.SA.project.DTOs.ProductDTO;
import com.example.SA.project.domain.Customer;
import com.example.SA.project.domain.Order;
import com.example.SA.project.domain.Payment;
import com.example.SA.project.domain.Product;

public class OrderAdapter {


    public static Order getOrderfromOrderDTO(OrderDTO orderdto) {

        Order order = new Order(orderdto.getOrdernumber(),orderdto.getDate(),orderdto.getQuantity());
        Product product=new Product(orderdto.getProductdto().getProductnumber(),orderdto.getProductdto().getName(),orderdto.getProductdto().getPrice());
       Customer customer=new Customer(orderdto.getCustomerdto().getCustomernumber(),orderdto.getCustomerdto().getName());
       Payment payment=new Payment(orderdto.getPaymentdto().getAmount());
       order.setCustomer(customer);
       order.setProduct(product);
       order.setPayment(payment);
        return order;
    }

    public static OrderDTO getOrderDTOfromOrder(Order order) {

        OrderDTO orderdto = new OrderDTO(order.getOrdernumber(),order.getDate(),order.getQuantity());
        ProductDTO productdto=new ProductDTO(order.getProduct().getProductnumber(),order.getProduct().getName(),order.getProduct().getPrice());
        CustomerDTO customer=new CustomerDTO(order.getCustomer().getCustomernumber(),order.getCustomer().getName());
        PaymentDTO paymentdto=new PaymentDTO(order.getPayment().getAmount());
        orderdto.setCustomerdto(customer);
        orderdto.setProductdto(productdto);
        orderdto.setPaymentdto(paymentdto);
        return orderdto;
    }
}