package org.example;

public class Order {
    private String orderName;
    private String orderType;
    private double orderNumber;

    public Order(){

    }
    public Order(String orderName, String orderType, double orderNumber) {
        this.orderName = orderName;
        this.orderType = orderType;
        this.orderNumber = orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public double getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(double orderNumber) {
        this.orderNumber = orderNumber;
    }
}
