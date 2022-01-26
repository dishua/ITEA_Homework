package com.itea.dshymanskyi.Lesson3_10122021;

import java.util.HashMap;
import java.util.Map;

public class Homework3_5 {

    public static void main(String[] args) {
        String wordList = "rabbit dog bribe";
        String filter = "go";

        for (String word : wordList.split("\\s")) {
            if (isWordMatchesFilter(word, filter)) {
                System.out.println(word + " ");
            }
        }
    }

    private static boolean isWordMatchesFilter(String word, String filter) {
        Map<Character, Integer> wordMap = stringToMap(word);
        Map<Character, Integer> filterMap = stringToMap(filter);

        for (Map.Entry<Character, Integer> entry : filterMap.entrySet()) {
            if (!wordMap.containsKey(entry.getKey())) {
                return false;
            }
            if (!wordMap.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> stringToMap(String word) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (char item : word.trim().toCharArray()) {
            if (charMap.containsKey(item)) {
                charMap.put(item, charMap.get(item) + 1);
            } else {
                charMap.put(item, 1);
            }
        }
        return charMap;
    }
}