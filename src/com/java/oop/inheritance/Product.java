package com.java.oop.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewCount;
    byte discountPercentage;
    boolean isAvaliable;
    String category;
    String fastDelivery;

    public Product(int id, String name, int maxRetailPrice, float rating, int reviewCount, byte discountPercentage, boolean isAvaliable, String category, String fastDelivery) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.discountPercentage = discountPercentage;
        this.isAvaliable = isAvaliable;
        this.category = category;
        this.fastDelivery = fastDelivery;
    }

    public Product(int id, String product1, int maxRetailPrice, int rating, float v, int discountPercentage, String dell, String laptop) {
    }

    void displayProductDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Max Retail Price: " + maxRetailPrice);
        System.out.println("Rating: " + rating);
    }
    int calculateFinalPrice(RegularCustomer customer){
        int discount = maxRetailPrice * discountPercentage / 100;
        return maxRetailPrice - discount + customer.shippingCharges;

    }
    int calculateFinalprice(PremiumCustomer customer){
        discountPercentage += 20;
        int discount = maxRetailPrice * discountPercentage /  100;
        return maxRetailPrice - discountPercentage; 

    }

    public void displayDetails() {
    }
}
