package com.spring.practice.Beans;


public class Product {
    private String name;
    private int quantite;
    private int price;

    public Product() {

    }

    public Product(String name, int quantite, int price) {
        this.name=name;
        this.price=price;
        this.quantite =quantite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int qantity) {
        this.quantite = qantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name+"||"+ quantite +"||"+price;
    }
}
