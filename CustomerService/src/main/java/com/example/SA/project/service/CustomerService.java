package com.example.SA.project.service;

import com.example.SA.project.Adapter.CustomerAdapter;
import com.example.SA.project.DTOs.CustomerDTO;
import com.example.SA.project.domain.Customer;
import com.example.SA.project.kafka.KafkaSender;
import com.example.SA.project.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerrepository;
    @Autowired
    private KafkaSender sender;

    public CustomerDTO getcustomer(long customernumber) {
        Customer cust = customerrepository.findById(customernumber).get();
        CustomerDTO custdto = CustomerAdapter.getCustomerDTOFromCustomer(cust);
        return custdto;

    }

    public void addCustomer(CustomerDTO custdto) {
        Customer cust = CustomerAdapter.getCustomerFromCustomerDTO(custdto);
        customerrepository.save(cust);
    }

    public void updateCustomer(CustomerDTO custdto, String name) {
        custdto.setName(name);
        Customer cust = CustomerAdapter.getCustomerFromCustomerDTO(custdto);
        cust.setName(name);
        sender.send("topicB",custdto);
        customerrepository.save(cust);

    }

    public void updateCustomeremail(CustomerDTO custdto, String email) {
        Customer cust = CustomerAdapter.getCustomerFromCustomerDTO(custdto);
        cust.setName(email);
        customerrepository.save(cust);

    }

    public void deleteCustomer(long customernumber) {
        Customer customer = customerrepository.findById(customernumber).get();
        customerrepository.delete(customer);

    }
}