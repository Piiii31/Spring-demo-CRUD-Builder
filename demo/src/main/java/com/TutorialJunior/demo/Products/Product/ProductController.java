package com.TutorialJunior.demo.Products.Product;


import com.TutorialJunior.demo.Products.Requests.ProductCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    private final ProductService productService;

    @Autowired

    ProductController (ProductService productService) {
       this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping
    public void saveProduct(@RequestBody ProductCreationRequest productCreationRequest) {
        productService.saveProduct(productCreationRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
}
