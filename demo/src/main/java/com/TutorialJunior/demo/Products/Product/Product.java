package com.TutorialJunior.demo.Products.Product;

import com.TutorialJunior.demo.Products.Category.Category;
import jakarta.persistence.* ;
import lombok.Builder;
import lombok.Data;

@Entity
@Table
@Data
@Builder
public class Product {
   @Id
    @SequenceGenerator(
              name = "product_sequence",
              sequenceName = "product_sequence",
              allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "product_sequence")

    private Integer id ;
    private String name ;
    private String description ;
    private Double price ;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;



    public Product() {
    }
    public Product(Category category) {
        this.category = category;
    }

    public Product(Integer id, String name, String description, Double price, Category category) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }


    @Override
    public String toString(){
        return "Product{"+
                "id="+id+
                ",name='"+name+'\''+
                ",description='"+description+'\''+
                "category='"+category+'\''+
                ",price="+price+
                '}';
    }
}
