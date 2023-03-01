package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "dish_name")
    private String dishName;

    @Column(name = "dish_image")
    private String dishImage;

    @Column(name = "ingredients")
    private Long ingredients;

    @Column(name = "recipes")
    private Long recipes;

    @Column(name = "complexities")
    private Long complexities;

    public Dish() { }

    public Dish(Long id, String dishName, String dishImage, Long ingredients, Long recipes, Long complexities) {
        this.id = id;
        this.dishName = dishName;
        this.dishImage = dishImage;
        this.ingredients = ingredients;
        this.recipes = recipes;
        this.complexities = complexities;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getDishName() { return dishName; }

    public void setDishName(String dishName) { this.dishName = dishName; }

    public String getDishImage() { return dishImage; }

    public void setDishImage(String dishImage) { this.dishImage = dishImage; }

    public Long getIngredients() { return ingredients; }

    public void setIngredients(Long ingredients) { this.ingredients = ingredients; }

    public Long getRecipes() { return recipes; }

    public void setRecipes(Long recipes) { this.recipes = recipes; }

    public Long getComplication() { return complexities; }

    public void setComplication(Long complexities) {
        this.complexities = complexities;
    }
}
