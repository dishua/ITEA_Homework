package com.itea.dshymanskyi.Lesson5_17122021;

public class MoldovanHen extends Hen {

    String country = "Moldova";
    int eggsPerMonth = 6;

    public int getCountOfEggsPerMonth() {
        return eggsPerMonth;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
