package com.itea.dshymanskyi.Lesson4_14122021;

import java.util.Date;

public class Homework4_1_Student extends Homework4_1_Human {
    private final int id;
    private final String department;
    private final double avgScore;
    private final Date admissionYear;

    public Homework4_1_Student(String firstName, String secondName, int id, String department, double avgScore, Date admissionYear) {
        super(firstName, secondName);
        this.id = id;
        this.department = department;
        this.avgScore = avgScore;
        this.admissionYear = admissionYear;
    }

    @Override
    public String toString() {
        return "Я студент." + super.toString() + " Мой средний бал: " + avgScore;
    }


}

