package com.graphql.inventory_service_using_graphql;

import com.graphql.inventory_service_using_graphql.entity.Product;
import com.graphql.inventory_service_using_graphql.repo.ProductRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class InventoryServiceUsingGraphqlApplication {


//	@Autowired
//	private ProductRepo productRepo;
//
//	@PostConstruct
//	public void initDb() {
//		List<Product> products = Stream.of(
//				new Product("Laptop", "Electronics", 73396.96f, 52),
//				new Product("Smartphone", "Electronics", 49999.99f, 100),
//				new Product("Tablet", "Electronics", 29999.99f, 75),
//				new Product("Smartwatch", "Wearables", 19999.99f, 60),
//				new Product("Headphones", "Audio", 9999.99f, 150),
//				new Product("Television", "Electronics", 89999.99f, 30),
//				new Product("Digital Camera", "Photography", 54999.99f, 25),
//				new Product("Bluetooth Speaker", "Audio", 7999.99f, 80),
//				new Product("Gaming Console", "Gaming", 29999.99f, 40),
//				new Product("Laptop Stand", "Accessories", 1999.99f, 200),
//				new Product("USB-C Charger", "Accessories", 1999.99f, 120),
//				new Product("HDMI Cable", "Accessories", 999.99f, 300),
//				new Product("Wireless Mouse", "Accessories", 1499.99f, 100),
//				new Product("Mechanical Keyboard", "Accessories", 2499.99f, 90),
//				new Product("Webcam", "Accessories", 2999.99f, 70),
//				new Product("Fitness Tracker", "Wearables", 3499.99f, 80)
//		).collect(Collectors.toList());
//
//		productRepo.saveAll(products);
//	}



	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceUsingGraphqlApplication.class, args);
	}

}
