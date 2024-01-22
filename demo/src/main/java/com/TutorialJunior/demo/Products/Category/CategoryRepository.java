package com.TutorialJunior.demo.Products.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findCategoryById(Integer categoryId);

    // You can add custom queries here if needed
}
