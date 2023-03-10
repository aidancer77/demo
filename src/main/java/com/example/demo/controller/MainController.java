package com.example.demo.controller;

import com.example.demo.domain.Main;
import com.example.demo.domain.Recipe;
import com.example.demo.repo.MainRepo;
import com.example.demo.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class MainController {
    private final MainRepo mainRepo;

    @Autowired
    public MainController(MainRepo mainRepo) { this.mainRepo = mainRepo; }

    @GetMapping("/main")
    public List<Main> getAll() {
        return mainRepo.findAll();
    }

    @GetMapping("/main/{id}")
    public Main getOne(@PathVariable("id") Main main) {
        return main;
    }

    @PostMapping("/main")
    public Main create(@RequestBody Main main) {
        return mainRepo.save(main);
    }
}
