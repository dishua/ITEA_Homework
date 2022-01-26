package com.itea.dshymanskyi.Lesson2_07122021;

/*1. Создайте 2 массива с 5 случайных целых чисел с отрезка [0; 5] каждый
2. Выведете массиви на экран в двух отдельных строках
3. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого с массивов это значение оказалось больше (или сообщите, что их среднее арифметическое равны)*/

import java.util.Random;

public class HomeworkArr2_5 {
    public static void main(String[] args) {
        int arraySize = 5;
        int[] arrayOne = new int[arraySize];
        int[] arrayTwo = new int[arraySize];
        double sumOfElementsArrayOne = 0;
        double sumOfElementsArrayTwo = 0;
        Random random = new Random();


        for (int i = 0; i < arraySize; i++) {
            arrayOne[i] = random.nextInt(5);
            arrayTwo[i] = random.nextInt(5);
        }

        for (int i = 0; i < arraySize * 2; i++) {
            if (i == arraySize) {
                System.out.println("\n");
            }
            if (i < arraySize) {
                System.out.print(arrayOne[i] + " ");
            } else {
                System.out.print(arrayTwo[i - arraySize] + " ");
            }

        }

        for (int i = 0; i < arraySize; i++) {
            sumOfElementsArrayOne += arrayOne[i];
            sumOfElementsArrayTwo += arrayTwo[i];
        }

        double avgArrayOne = sumOfElementsArrayOne / arraySize;
        double avgArrayTwo = sumOfElementsArrayTwo / arraySize;

        if (avgArrayOne == avgArrayTwo) {
            System.out.println("\nСреднее арифметическое массивов равно");
        } else if (avgArrayOne > avgArrayTwo) {
            System.out.println("\nСреднее арифметическое первого массива больше");
        } else {
            System.out.println("\nСреднее арифметическое второго массива больше");
        }

    }
}
