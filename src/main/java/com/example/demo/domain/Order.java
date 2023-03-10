package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "dishes_date")
    private String dishesDate;

    @Column(name = "users_id")
    private String usersId;

    @Column(name = "dishes_id")
    private String dishesId;

    @Column(name = "meals_id")
    private String mealsId;

    public Order() { }

    public Order(Long id, String orderDate, String dishesDate, String usersId, String dishesId, String mealsId) {
        this.id = id;
        this.orderDate = orderDate;
        this.dishesDate = dishesDate;
        this.usersId = usersId;
        this.dishesId = dishesId;
        this.mealsId = mealsId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { this.orderDate = orderDate; }

    public String getDishesDate() { return dishesDate; }
    public void setDishesDate(String dishesDate) { this.dishesDate = dishesDate; }

    public String getUsersId() { return usersId; }
    public void setUsersId(String userId) { this.usersId = userId; }

    public String getDishesId() { return dishesId; }
    public void setDishesId(String dishesId) { this.dishesId = dishesId; }

    public String getMealsId() { return mealsId; }
    public void setMealsId(String mealsId) { this.mealsId = mealsId; }
}
