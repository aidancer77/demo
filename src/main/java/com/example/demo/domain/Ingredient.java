package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "ingredient_name")
    private String ingredientName;

    @Column(name = "ingredient_weight")
    private String ingredientWeight;

    public Ingredient() { }

    public Ingredient(Integer id, String ingredientName, String ingredientWeight) {
        this.id = id;
        this.ingredientName = ingredientName;
        this.ingredientWeight = ingredientWeight;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getIngredientName() { return ingredientName; }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientWeight() { return ingredientWeight; }

    public void setIngredientWeight(String ingredientWeight) {
        this.ingredientWeight = ingredientWeight;
    }
}
