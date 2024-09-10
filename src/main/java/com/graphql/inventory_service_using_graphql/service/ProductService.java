package com.graphql.inventory_service_using_graphql.service;

import com.graphql.inventory_service_using_graphql.entity.Product;
import com.graphql.inventory_service_using_graphql.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {


    @Autowired
    private ProductRepo productRepo;



    public List<Product> getProducts(){
        return productRepo.findAll();
    }

    public  List<Product> getProductByCategory(String cat){
        return  productRepo.findByCategory(cat);
    }

    public  Product updateStock(int id, int quantity){
        Product product=productRepo.findById(id)
                .orElseThrow(()->new RuntimeException("product not found with id"+id));
        product.setStock(quantity);
        return productRepo.save(product);
    }


    public  Product receiveNewShipment(int id, int quantity){

        Product product=productRepo.findById(id)
                .orElseThrow(()->new RuntimeException("product not found with id"+id));
        product.setStock(product.getStock()+quantity);
        return  productRepo.save(product);
    }




}
