package com.itea.dshymanskyi.Lesson3_10122021;

public class Homework3_1 {
    public static void main(String[] args) {
        String word = "123ABCCBA321";
        char[] wordArray = word.toCharArray();
        int matchCount = 0;

        for (int i = 0; i < wordArray.length / 2; i++) {
            if (wordArray[i] == wordArray[wordArray.length - i - 1]) {
                matchCount++;
            }
        }

        if (matchCount == wordArray.length / 2) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not a palindrome");

        }


    }

}
