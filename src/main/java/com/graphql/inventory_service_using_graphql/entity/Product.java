package com.graphql.inventory_service_using_graphql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor  // Generates a constructor for all fields
@NoArgsConstructor   // Generates a no-args constructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String category;
    private Float price;
    private Integer stock;

    public Product(String name, String category, Float price, Integer stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }


}
