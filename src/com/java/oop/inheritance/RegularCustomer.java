package com.java.oop.inheritance;

public class RegularCustomer extends Customer {
        int shippingCharges = 50;
        char membership = 'S';

        public RegularCustomer(String name, String email, long phNumber, String address, int shippingCharges, char membership) {
            super(name, email, phNumber, address);
            this.shippingCharges = shippingCharges;
            this.membership = membership;
        }
}
