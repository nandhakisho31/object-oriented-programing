package com.java.oop.inheritance;

public class Laptop extends Product {
    int ram;
    String operatingSystem;
    String company;

    public Laptop(int id, String name, int maxRetailPrice, float rating, int reviewCount, byte discountPercentage, boolean isAvaliable, String category, String fastDelivery, int ram, String operatingSystem, String company) {
        super(id, name, maxRetailPrice, rating, reviewCount, discountPercentage, isAvaliable, category, fastDelivery);
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.company = company;
    }
}
