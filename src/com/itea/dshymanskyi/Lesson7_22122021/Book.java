package com.itea.dshymanskyi.Lesson7_22122021;

public class Book {

    private final String name;
    private final String author;
    private String publisher;
    private double price;

    public Book(String name, String author, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if (price > 10) {
            this.price = price;
        } else {
            System.out.println("Price should be more than 10");
            this.price = 10.0;
        }
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 10) {
            this.price = price;
        } else {
            System.out.println("Price should be more than 10");
            this.price = 10.0;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
