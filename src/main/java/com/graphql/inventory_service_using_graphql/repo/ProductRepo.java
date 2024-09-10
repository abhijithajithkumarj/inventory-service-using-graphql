package com.graphql.inventory_service_using_graphql.repo;

import com.graphql.inventory_service_using_graphql.entity.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository< Product, Integer> {
    List<Product> findByCategory(String category);
}
