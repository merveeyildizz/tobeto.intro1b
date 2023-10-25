package org.example;

public class Category {
    private String name;
    private double number;
    private String urlImage;

    public Category(){
        System.out.println("Boş const çalıştırıldı.");
    }
    public Category(String name, double number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
