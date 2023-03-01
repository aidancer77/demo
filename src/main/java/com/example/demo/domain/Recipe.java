package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "action")
    private String action;

    public Recipe() { }

    public Recipe(Integer id, String action) {
        this.id = id;
        this.action = action;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getAction() { return action; }

    public void setAction(String action) { this.action = action; }
}
