package com.itea.dshymanskyi.Lesson5_17122021;

public class UkrainianHen extends Hen {

    String country = "Ukraine";
    int eggsPerMonth = 10;

    public int getCountOfEggsPerMonth() {
        return eggsPerMonth;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
