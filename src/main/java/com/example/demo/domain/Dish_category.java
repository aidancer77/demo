package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "dishes_categories")
public class Dish_category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "dishes_categories_name")
    private String dishesCategoriesName;
}
