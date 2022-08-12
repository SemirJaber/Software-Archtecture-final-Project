package com.example.SA.project.Adapter;

import com.example.SA.project.DTOs.AddressDTO;
import com.example.SA.project.DTOs.ContactDTO;
import com.example.SA.project.DTOs.CustomerDTO;
import com.example.SA.project.domain.Address;
import com.example.SA.project.domain.Contact;
import com.example.SA.project.domain.Customer;

public class CustomerAdapter {


    public static Customer getCustomerFromCustomerDTO(CustomerDTO customerdto){

        Customer customer=new Customer(customerdto.getCustomernumber(),customerdto.getName());
        Contact contact=new Contact(customerdto.getContactdto().getPhone(),customerdto.getContactdto().getEmail());
        Address address=new Address(customerdto.getAddressdto().getCity(),customerdto.getAddressdto().getStreet(),customerdto.getAddressdto().getZip());
        customer.setAddress(address);
        customer.setContact(contact);

        return customer;
    }

    public static CustomerDTO getCustomerDTOFromCustomer(Customer customer){

        CustomerDTO customerdto=new CustomerDTO(customer.getCustomernumber(),customer.getName());
        ContactDTO contactdto=new ContactDTO(customer.getContact().getPhone(),customer.getContact().getEmail());
        AddressDTO addressdto=new AddressDTO(customer.getAddress().getCity(),customer.getAddress().getStreet(),customer.getAddress().getZip());
        customerdto.setAddressdto(addressdto);
        customerdto.setContactdto(contactdto);

        return customerdto;
    }

}
