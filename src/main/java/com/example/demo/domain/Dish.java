package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String dishName;

    @Column(name = "dishes_categories_id")
    private String dishesCategoriesId;

    public Dish() { }

    public Dish(Long id, String dishName, String dishesCategoriesId) {
        this.id = id;
        this.dishName = dishName;
        this.dishesCategoriesId = dishesCategoriesId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDishName() { return dishName; }
    public void setDishName(String dishName) { this.dishName = dishName; }

    public String getDishesCategoriesId() {
        return dishesCategoriesId;
    }
    public void setDishesCategoriesId(String dishesCategoriesId) {
        this.dishesCategoriesId = dishesCategoriesId;
    }
}