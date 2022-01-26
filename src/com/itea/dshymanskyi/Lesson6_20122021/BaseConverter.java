package com.itea.dshymanskyi.Lesson6_20122021;

public class BaseConverter implements Converter {

    @Override
    public double convert(double temperature, char targetTemperature) {
        if (targetTemperature == 'k') {
            return temperature + 273.15;
        }
        if (targetTemperature == 'f') {
            return temperature * 1.8 + 32;
        }
        return 0;
    }

    public BaseConverter() {
    }

}
