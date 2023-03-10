package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "order_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDateTime orderDate;

    @Column(name = "dishes_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDateTime dishesDate;

    @Column(name = "users_id")
    private String usersId;

    @Column(name = "dishes_id")
    private String dishesId;

    @Column(name = "meals_id")
    private String mealsId;

    public Order() { }

    public Order(Long id, LocalDateTime orderDate, LocalDateTime dishesDate, String usersId, String dishesId, String mealsId) {
        this.id = id;
        this.orderDate = orderDate;
        this.dishesDate = dishesDate;
        this.usersId = usersId;
        this.dishesId = dishesId;
        this.mealsId = mealsId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public LocalDateTime getDishesDate() { return dishesDate; }
    public void setDishesDate(LocalDateTime dishesDate) { this.dishesDate = dishesDate; }

    public String getUsersId() { return usersId; }
    public void setUsersId(String userId) { this.usersId = userId; }

    public String getDishesId() { return dishesId; }
    public void setDishesId(String dishesId) { this.dishesId = dishesId; }

    public String getMealsId() { return mealsId; }
    public void setMealsId(String mealsId) { this.mealsId = mealsId; }
}
