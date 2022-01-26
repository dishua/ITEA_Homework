package com.itea.dshymanskyi.Lesson9_05012022;

public class WeekdayRunner {

    public static void main(String[] args) {
        Weekday wd = Weekday.MONDAY;

        System.out.println(wd.isHoliday());

        for (Weekday day : Weekday.values()) {
            System.out.println(day.toString() + " - " + day.whatToDo());
        }
    }
}
