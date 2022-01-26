package com.itea.dshymanskyi.Lesson5_17122021;

public class PolishHen extends Hen {

    String country = "Poland";
    int eggsPerMonth = 8;


    public int getCountOfEggsPerMonth() {
        return eggsPerMonth;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
