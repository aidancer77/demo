package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String ingredientName;

    @Column(name = "measure")
    private String ingredientMeasure;

    public Ingredient() { }

    public Ingredient(Integer id, String ingredientName, String ingredientMeasure) {
        this.id = id;
        this.ingredientName = ingredientName;
        this.ingredientMeasure = ingredientMeasure;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getIngredientName() { return ingredientName; }
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientMeasure() { return ingredientMeasure; }
    public void setIngredientMeasure(String ingredientMeasure) { this.ingredientMeasure = ingredientMeasure; }
}
