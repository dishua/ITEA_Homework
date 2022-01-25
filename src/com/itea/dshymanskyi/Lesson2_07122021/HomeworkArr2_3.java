package com.itea.dshymanskyi.Lesson2_07122021;

/*1. Создайте массив с 4 случайных целых чисел с отрезка [10; 99]
2. Выведете  его на экран в строчку.
3. Дальше определите и выведете на экран сообщение о том, есть ли массив строго растущей последовательностью. */

import java.util.Random;

public class HomeworkArr2_3 {
    public static void main(String[] args) {
        int arraySize = 4;
        boolean isArrayGrowing = true;
        Random random = new Random();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(99 - 10) + 10;
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < arraySize - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isArrayGrowing = false;
                break;
            }
        }

        if (isArrayGrowing) {
            System.out.println("\nМассив со строго растущей последовательностью");
        }
    }
}
