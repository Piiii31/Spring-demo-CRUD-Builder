package com.TutorialJunior.demo.Products.Category;
import com.TutorialJunior.demo.Products.Product.Product;
import jakarta.persistence.* ;

import java.util.List;

@Entity
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private List<Product> products;

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {

    }
    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
