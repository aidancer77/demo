package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "main_info")
public class MainInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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

    public MainInfo() {
    }

    public MainInfo(Integer id, String duration, String complexity, String energyValue, String proteins, String fats, String carbohydrates) {
        this.id = id;
        this.duration = duration;
        this.complexity = complexity;
        this.energyValue = energyValue;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(String energyValue) {
        this.energyValue = energyValue;
    }

    public String getProteins() {
        return proteins;
    }

    public void setProteins(String proteins) {
        this.proteins = proteins;
    }

    public String getFats() {
        return fats;
    }

    public void setFats(String fats) {
        this.fats = fats;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
