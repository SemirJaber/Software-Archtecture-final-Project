package com.example.SA.project.service;

import com.example.SA.project.Adapter.ProductAdapter;
import com.example.SA.project.DTOs.ProductDTO;
import com.example.SA.project.Repositories.ProductRepository;
import com.example.SA.project.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productrepository;

    public ProductDTO getProduct(long productnumber){
        Product product=productrepository.findById(productnumber).get();
        ProductDTO productdto= ProductAdapter.getProductDTOfromProduct(product);
        return productdto;
    }
    public void addProduct(ProductDTO productdto){
        Product product=ProductAdapter.getProductfromProductDTO(productdto);
        productrepository.save(product);
    }
    public void updateProduct(ProductDTO productdto,double price){
        Product product=ProductAdapter.getProductfromProductDTO(productdto);
        product.setPrice(price);
        productrepository.save(product);
    }
    public void deleteProduct(long productnumber){
     Product product=productrepository.findById(productnumber).get();
        productrepository.delete(product);
    }
}
