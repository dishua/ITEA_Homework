package com.itea.dshymanskyi.Lesson5_17122021;

public class HenFactory {

    Hen getHen(String country) {

        switch (country) {
            case "Ukraine" -> {
                return new UkrainianHen();
            }
            case "Moldova" -> {
                return new MoldovanHen();
            }
            case "Belarus" -> {
                return new BelarusianHen();
            }
            case "Poland" -> {
                return new PolishHen();
            }
            default -> System.out.println("Oooops, something wrong !");
        }
        return null;
    }
}
