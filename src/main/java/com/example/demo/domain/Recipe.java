package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ingredients_id")
    private Long ingredientsId;

    @Column(name = "ingredient_quantity")
    private Long ingredientQuantity;

    @Column(name = "dishes_id")
    private Long dishesId;

    public Recipe() { }

    public Recipe(Long id, Long ingredientsId, Long ingredientQuantity, Long dishesId) {
        this.id = id;
        this.ingredientsId = ingredientsId;
        this.ingredientQuantity = ingredientQuantity;
        this.dishesId = dishesId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIngredientsId() { return ingredientsId; }
    public void setIngredientsId(Long ingredientsId) { this.ingredientsId = ingredientsId; }

    public Long getIngredientQuantity() { return ingredientQuantity; }
    public void setIngredientQuantity(Long ingredientQuantity) { this.ingredientQuantity = ingredientQuantity; }

    public Long getDishesId() { return dishesId; }
    public void setDishesId(Long dishesId) { this.dishesId = dishesId; }
}
