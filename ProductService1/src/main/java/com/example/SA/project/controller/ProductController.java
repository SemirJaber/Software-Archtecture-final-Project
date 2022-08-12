package com.example.SA.project.controller;

import com.example.SA.project.DTOs.ProductDTO;
import com.example.SA.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService productservice;
    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestBody ProductDTO productdto){
        productservice.addProduct(productdto);
        return new ResponseEntity<ProductDTO>(productdto,HttpStatus.OK);
    }
    @GetMapping("/products/{productnumber}")
    public ResponseEntity<?> getProduct(@PathVariable long productnumber){
        ProductDTO productdto=productservice.getProduct(productnumber);
        return new ResponseEntity<ProductDTO>(productdto,HttpStatus.OK);
    }
    @PutMapping("/products/{price}")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO productdto,@PathVariable double price){
        productservice.updateProduct(productdto,price);
        return new ResponseEntity<ProductDTO>(productdto,HttpStatus.OK);
    }
    @DeleteMapping("/products/{productnumber}")
    public ResponseEntity<?> deleteProduct(@PathVariable long productnumber){
        ProductDTO productdto=productservice.getProduct(productnumber);
        productservice.deleteProduct(productnumber);
        return new ResponseEntity<ProductDTO>(productdto,HttpStatus.OK);
    }
}
