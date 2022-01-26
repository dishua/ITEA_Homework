package com.itea.dshymanskyi.Lesson5_17122021;

public class HenRunner {

    public static void main(String[] args) {

        HenFactory henFactory = new HenFactory();

        System.out.println(henFactory.getHen("Ukraine").getDescription());

    }
}
