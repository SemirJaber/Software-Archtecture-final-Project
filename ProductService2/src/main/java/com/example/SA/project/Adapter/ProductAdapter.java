package com.example.SA.project.Adapter;

import com.example.SA.project.DTOs.ProductDTO;
import com.example.SA.project.DTOs.SupplierDTO;
import com.example.SA.project.domain.Product;
import com.example.SA.project.domain.Supplier;

public class ProductAdapter {


    public static ProductDTO getProductDTOfromProduct(Product product){
        ProductDTO productdto=new ProductDTO(product.getProductnumber(),product.getName(),product.getPrice());
      //  SupplierDTO supplierdto=new SupplierDTO(product.getSupplier().getName(),product.getSupplier().getPhone());
       // productdto.setSupplierdto(supplierdto);
        return productdto;

    }
    public static Product getProductfromProductDTO(ProductDTO productdto){
        Product product=new Product(productdto.getProductnumber(),productdto.getName(),productdto.getPrice());
     //   Supplier supplier=new Supplier(productdto.getSupplierdto().getName(),productdto.getSupplierdto().getPhone());
     //   product.setSupplier(supplier);
        return product;
    }
}
