package com.itea.dshymanskyi.Lesson8_29122021;

import java.util.ArrayList;

public class Payment {
    private double totalPrice = 0;
    ArrayList<Product> payment = new ArrayList<Product>();

    private class Product {
        private final String name;
        private final double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

    }

    public void addToPayment(String name, double price) {
        Product product = new Product(name, price);
        payment.add(product);
        totalPrice += product.price;
    }

}
