package com.java.oop.inheritance;

public class PremiumCustomer extends Customer{
    int shippingCharges;
    char membership;

    public PremiumCustomer(String name, String email, long phNumber, String address, int shippingCharges, char membership) {
        super(name, email, phNumber, address);
        this.shippingCharges = shippingCharges;
        this.membership = membership;
    }
}
