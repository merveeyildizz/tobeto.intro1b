package org.example.entities;

public class Car {
    private int id;
    private int stock;
    private double price;
    public String brand;
    public String color;


    public Car() {
    }

    public Car(int id, double price, String brand, String color,int stock) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.stock=stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
