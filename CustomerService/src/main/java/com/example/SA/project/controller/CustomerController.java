package com.example.SA.project.controller;

import com.example.SA.project.DTOs.CustomerDTO;
import com.example.SA.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerservice;
    @GetMapping("/customers/{customernumber}")
    public ResponseEntity<?> getCustomer(@PathVariable long customernumber){
        CustomerDTO customerdto=customerservice.getcustomer(customernumber);
        return new ResponseEntity<CustomerDTO>(customerdto, HttpStatus.OK);
    }
    @PostMapping("/customers")
    public ResponseEntity<?>addCustomer(@RequestBody CustomerDTO customerdto){
         customerservice.addCustomer(customerdto);
         return new ResponseEntity<CustomerDTO>(customerdto,HttpStatus.OK);

    }
    @PutMapping("/customers/{name}")
    public ResponseEntity<?> updateCustomer(@RequestBody CustomerDTO customerdto,@PathVariable String name){
             customerservice.updateCustomer(customerdto,name);
             return new ResponseEntity<CustomerDTO>(customerdto,HttpStatus.OK);
    }
//    @PutMapping("/customers/{email}")
//    public ResponseEntity<?> updateCustomeremail(@RequestBody CustomerDTO customerdto,@PathVariable String email){
//        customerservice.updateCustomeremail(customerdto,email);
//        return new ResponseEntity<CustomerDTO>(customerdto,HttpStatus.OK);
//    }


    @DeleteMapping("/customers/{customernumber}")
    public ResponseEntity<?> deleteCustomer(@PathVariable long customernumber){
        CustomerDTO customerdto=customerservice.getcustomer(customernumber);
         customerservice.deleteCustomer(customernumber);
     return new ResponseEntity<CustomerDTO>(customerdto,HttpStatus.OK);
    }
}
