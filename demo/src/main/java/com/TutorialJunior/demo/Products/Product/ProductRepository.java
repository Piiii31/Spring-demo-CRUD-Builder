package com.TutorialJunior.demo.Products.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // You can add custom queries here if needed
}
