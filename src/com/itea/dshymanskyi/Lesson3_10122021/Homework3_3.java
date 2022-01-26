package com.itea.dshymanskyi.Lesson3_10122021;

public class Homework3_3 {
    public static void main(String[] args) {

        String first = "This is exercise 1";
        String second = "This is Exercise 1";

        if (first.compareToIgnoreCase(second) == 0) {
            System.out.println(first + " is equal to " + second);
        } else {
            System.out.println(first + " is NOT equal to " + second);
        }
    }
}
