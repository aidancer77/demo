package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "meals_name")
    private String dishName;

    public Meal() { }

    public Meal(Long id, String dishName) {
        this.id = id;
        this.dishName = dishName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDishName() { return dishName; }
    public void setDishName(String dishName) { this.dishName = dishName; }
}
