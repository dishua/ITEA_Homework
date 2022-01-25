package com.itea.dshymanskyi.Lesson2_07122021;

/*Создайте массив с 12 случайных целых чисел с отрезка [-15; 15].
Определите какой элемент есть в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.*/

import java.util.Random;

public class HomeworkArr2_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[12];

        for (int i = 0; i < 12; i++) {
            array[i] = random.nextInt(30) - 15;
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int maxIndex = 0;

        for (int i = 0; i < 12; i++) {
            if (max <= array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("\nИндекс максимального елемента > " + maxIndex);
    }
}
