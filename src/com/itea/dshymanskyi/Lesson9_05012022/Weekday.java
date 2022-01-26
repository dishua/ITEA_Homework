package com.itea.dshymanskyi.Lesson9_05012022;

public enum Weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public boolean isWeekDay() {
        return !isHoliday();
    }

    public boolean isHoliday() {
        return this.equals(SATURDAY) || this.equals(SUNDAY);
    }

    public String whatToDo() {
        if (this.isWeekDay()) {
            return "Go to work";
        } else {
            return "Party tonight!";
        }
    }
}

