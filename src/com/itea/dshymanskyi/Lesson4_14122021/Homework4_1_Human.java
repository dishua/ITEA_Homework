package com.itea.dshymanskyi.Lesson4_14122021;

public class Homework4_1_Human {
    private final String firstName;
    private final String secondName;

    public Homework4_1_Human(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return " Мое имя: " + firstName + " и моя фамилия: " + secondName + ".";

    }

}
