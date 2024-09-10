package com.graphql.inventory_service_using_graphql.resource;


import com.graphql.inventory_service_using_graphql.entity.Product;
import com.graphql.inventory_service_using_graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductService service;


    @QueryMapping
        public List<Product> getProducts(){
        return service.getProducts();
    }


    @QueryMapping
    public  List<Product> getProductByCategory(@Argument String category){
        return  service.getProductByCategory(category);
    }


    @MutationMapping
    public  Product updateStock(@Argument int id, @Argument int stock){
        return service.updateStock(id,stock);
    }


    @MutationMapping
    public  Product receiveNewShipment(@Argument int id, @Argument int quantity){
        return service.receiveNewShipment(id,quantity);
    }


}
