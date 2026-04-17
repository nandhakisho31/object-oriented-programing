package com.java.oop;

public class Customer {
    String name;
    String emailId;
    long phoneNo;
    String gender;
    int age;
    String address;

    Customer(){
        System.out.println("Cusotomer constructer called");
        name = "Nandha kishore";
        emailId = "kish6718nandha@gmail.com";
        phoneNo = 9985332934L;
        gender = "Male";
        age = 18;
        address = "Visakhapatnam, Andhara Pradesh, 530027";
    }

    public Customer(String name, String emailId, long phoneNo, String gender, int age, String address) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }
}
