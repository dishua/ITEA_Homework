package com.itea.dshymanskyi.Lesson2_07122021;

/*Напишите программу, которая меняет местами єлементі одномерного массива с String в обратном порядке.
Не используйте дополнительный массив для сохранения результатов. */

public class HomeworkArr2_4 {
    public static void main(String[] args) {
        String[] array = {"Banana", "Apple", "Lemon", "Potato", "Tomato", "Dog"};
        String temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
