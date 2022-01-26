package com.itea.dshymanskyi.Lesson5_17122021;

public class BelarusianHen extends Hen {

    String country = "Belarus";
    int eggsPerMonth = 4;

    public int getCountOfEggsPerMonth() {
        return eggsPerMonth;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
