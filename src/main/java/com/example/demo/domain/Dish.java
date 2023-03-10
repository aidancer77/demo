package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "dishes_name")
    private String dishName;

    @Column(name = "dishes_categories_id")
    private String dishesCategoriesId;

    @Column(name = "duration")
    private String duration;

    @Column(name = "complexity")
    private String complexity;

    @Column(name = "energy_value")
    private String energyValue;

    @Column(name = "proteins")      //белки
    private String proteins;

    @Column(name = "fats")          //жиры
    private String fats;

    @Column(name = "carbohydrates")     //углеводы
    private String carbohydrates;

    @Column(name = "description")
    private String description;

    @Column(name = "dish_image")
    private String dishImage;

    public Dish() { }

    public Dish(Long id, String dishName, String dishesCategoriesId, String duration,
                String complexity, String energyValue, String proteins, String fats,
                String carbohydrates, String description, String dishImage) {
        this.id = id;
        this.dishName = dishName;
        this.dishesCategoriesId = dishesCategoriesId;
        this.duration = duration;
        this.complexity = complexity;
        this.energyValue = energyValue;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.description = description;
        this.dishImage = dishImage;
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

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getComplexity() { return complexity; }
    public void setComplexity(String complexity) { this.complexity = complexity; }

    public String getEnergyValue() { return energyValue; }
    public void setEnergyValue(String energyValue) { this.energyValue = energyValue; }

    public String getProteins() { return proteins; }
    public void setProteins(String proteins) { this.proteins = proteins; }

    public String getFats() { return fats; }
    public void setFats(String fats) { this.fats = fats; }

    public String getCarbohydrates() { return carbohydrates; }
    public void setCarbohydrates(String carbohydrates) { this.carbohydrates = carbohydrates; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDishImage() { return dishImage; }
    public void setDishImage(String dishImage) { this.dishImage = dishImage; }
}