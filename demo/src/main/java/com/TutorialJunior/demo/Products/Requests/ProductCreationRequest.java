package com.TutorialJunior.demo.Products.Requests;


import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class ProductCreationRequest {

    private String name;
    private String description;
    private Double price;
    private Integer categoryId;

}
