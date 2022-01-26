package com.itea.dshymanskyi.Lesson3_10122021;

public class Homework3_4 {
    public static void main(String[] args) {

        String string = "test string test gold"; //ts srn
        StringBuilder result = new StringBuilder();
        int charIndex = 0;

        for (char character : string.toCharArray()) {
            if (Character.isWhitespace(character)) {
                result.append(character);
                continue;
            }
            if (charIndex % 2 == 0) {
                result.append(character);
            }
            charIndex++;
        }
        System.out.println(result);
    }
}


