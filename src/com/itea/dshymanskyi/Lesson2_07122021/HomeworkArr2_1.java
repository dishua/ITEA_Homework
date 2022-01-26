package com.itea.dshymanskyi.Lesson2_07122021;

/*1.Создайте массив с 8-ми случайных целых чисел з отрезка [1; 10]
2.Выведите  массив на экран в результате
3.Замените каждый элемент с непарным индексом на ноль
4.Снова  выведете массив на экран  */

import java.util.Random;

public class HomeworkArr2_1 {
    public static void main(String[] args) {
        int arraySize = 8;
        Random random = new Random();
        int[] array = new int[arraySize];

        System.out.println("Создаем массив с рандомными числами");

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println("\nМеняем элементы с непарным индексом на 0");
        for (int i = 0; i < arraySize; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
