package com.java.oop;

public class Main {
    static void main() {


        Customer customer = new Customer();

        customer.name = "Nanadha Kishore";
        customer.age = 20;
        customer.address = "2-102 Kothapalem, Gopalpatnam, Visakhapatnam, Andhra pradesh 530027";
        customer.emailId = "kish6718nandha@gmail.com";
        customer.gender = "Male";
        customer.phoneNo = 8885332934L;

        Customer customer2 = new Customer();

        Customer customer1 = new Customer("kishore","kish@gmail.com",888633293L,"kish6718",20,"Address");

        System.out.println("-------------------");
        System.out.println("Customer Details");
        System.out.println("-------------------");
        System.out.println("Name: " + customer.name);
        System.out.println("Email ID: " + customer.emailId);
        System.out.println("age: " + customer.age);
        System.out.println("Phone No: " + customer.phoneNo);
        System.out.println("Address: " + customer.address);
        System.out.println("Gender: " + customer.gender);

        System.out.println("-------------------");
        System.out.println("Customer2 Details");
        System.out.println("-------------------");
        System.out.println("Name: " + customer1.name);
        System.out.println("Email ID: " + customer1.emailId);
        System.out.println("age: " + customer1.age);
        System.out.println("Phone No: " + customer1.phoneNo);
        System.out.println("Address: " + customer1.address);
        System.out.println("Gender: " + customer1.gender);

        System.out.println("-------------------");
        System.out.println("Customer3 Details");
        System.out.println("-------------------");
        System.out.println("Name: " + customer2.name);
        System.out.println("Email ID: " + customer2.emailId);
        System.out.println("age: " + customer2.age);
        System.out.println("Phone No: " + customer2.phoneNo);
        System.out.println("Address: " + customer2.address);
        System.out.println("Gender: " + customer2.gender);

        Product product = new Product();

        product.id = 2344;
        product.name = "Apple 2026 MacBook Air 13″ Laptop with M5 chip: AI and Apple Intelligence, 34.46 cm (13.6″) Liquid Retina Display, 16GB Unified Memory, 512GB SSD Storage, 12MP Center Stage Camera, Touch ID; Midnight";
        product.maxRetailPrice = 116990;
        product.rating = 4.1f;
        product.reviewCount = 6;
        product.discountPercentage = 2;
        product.isAvaliable = true;
        product.fastDelivery = "Friday 17Apr";
        product.company = "Apple";
        product.category = "Laptop";

        Product product2 = new Product();

        product2.id = 2544;
        product2.name = "IdeaPad Slim 3 13th Gen Core i7-13620H 15.3\" (38.8cm) WUXGA IPS Laptop (16GB RAM/1TB SSD/Win 11/Office 2024/Backlit/1Yr ADP Free/Top Metal Cover & IR Camera/Grey/1.6Kg), 83K100TDIN";
        product2.maxRetailPrice = 88990;
        product2.rating = 4.6f;
        product2.reviewCount = 3;
        product2.discountPercentage = 2;
        product2.isAvaliable = true;
        product2.fastDelivery = "Friday 17Apr";
        product2.company = "Lenovo";
        product2.category = "Laptop";

        System.out.println("----------------");
        System.out.println("Product 1 Details");
        System.out.println("----------------");
        System.out.println("Id: " + product.id);
        System.out.println("Name: " + product.name);
        System.out.println("Max Retail Price : " + product.maxRetailPrice);
        System.out.println("Rating: " + product.rating);
        System.out.println("product Review: " + product.reviewCount);
        System.out.println("Discount: " + product.discountPercentage);
        System.out.println("Status: " + product.isAvaliable);
        System.out.println("Delivery: " + product.fastDelivery);
        System.out.println("company: " + product.company);
        System.out.println("category: " + product.category);

        System.out.println("----------------");
        System.out.println("Product 2 Details");
        System.out.println("----------------");
        System.out.println("Id: " + product2.id);
        System.out.println("Name: " + product2.name);
        System.out.println("Max Retail Price : " + product2.maxRetailPrice);
        System.out.println("Rating: " + product2.rating);
        System.out.println("product Review: " + product2.reviewCount);
        System.out.println("Discount: " + product2.discountPercentage);
        System.out.println("Status: " + product2.isAvaliable);
        System.out.println("Delivery: " + product2.fastDelivery);
        System.out.println("company: " + product2.company);
        System.out.println("category: " + product2.category);




    }

}
