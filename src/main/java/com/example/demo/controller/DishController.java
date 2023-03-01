package com.example.demo.controller;

import com.example.demo.domain.Dish;
import com.example.demo.domain.Ingredient;
import com.example.demo.repo.DishRepo;
import com.example.demo.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class DishController {
    private final DishRepo dishRepo;

    @Autowired
    public DishController(DishRepo dishRepo) {
        this.dishRepo = dishRepo;
    }

    @GetMapping("/dishes")
    public List<Dish> getAll() {
        return dishRepo.findAll();
    }

    @GetMapping("/dishes/{id}")
    public Dish getOne(@PathVariable("id") Dish dish) {
        return dish;
    }
}
