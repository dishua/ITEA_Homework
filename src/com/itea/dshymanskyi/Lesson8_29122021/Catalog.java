package com.itea.dshymanskyi.Lesson8_29122021;

import java.util.ArrayList;

public class Catalog {

    ArrayList<Book> catalog = new ArrayList<>();

    private class Book {

        ArrayList<String> nameOfReaders = new ArrayList<>();

        private final String name;
        private final String author;

        public Book(String name, String author, String publisher, double price) {
            this.name = name;
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }


        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }

}
