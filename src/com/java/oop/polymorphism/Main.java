package com.java.oop.polymorphism;

import com.java.oop.inheritance.Laptop;
import com.java.oop.inheritance.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"product1",1000,10,4.5f,100,"Dell","Laptop");

        System.out.println(product);
        //com.java.oop.inheritance.Product@1b28cdfa
        // class@hashcode

        Service service = new Service();
        // service.add(laptop);

    }
}