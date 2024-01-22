package com.TutorialJunior.demo.Products.Product;

import com.TutorialJunior.demo.Products.Category.CategoryRepository;
import com.TutorialJunior.demo.Products.Requests.ProductCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {


    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Integer productId) {
        return productRepository.findById(productId);
    }

    public void saveProduct(ProductCreationRequest productCreationRequest) {
        var category = categoryRepository.findCategoryById(productCreationRequest.getCategoryId());
        Product product = Product.builder()
                .name(productCreationRequest.getName())
                .category(category)
                .price(productCreationRequest.getPrice())
                .description(productCreationRequest.getDescription())
                        .build();
                productRepository.save(product);
    }

    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }
}
