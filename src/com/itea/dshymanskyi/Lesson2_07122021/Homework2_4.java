package com.itea.dshymanskyi.Lesson2_07122021;

/*Задача №4
Напишите программу, где пользователь вводит любое целое положительное число.
Программа суммирует все цифры от 1 до введенного пользователя числом.

Например:
если пользователь вводит число 3. Программа должна посчитать сумму от 1 до 3, то есть 1 + 2 + 3 и выдавать ответ 6.
если пользователь вводит число 5. Программа должна посчитать сумму от 1 до 5, то есть 1 + 2 + 3 + 4 + 5 и выдавать ответ 15. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2_4 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите положительное число ");
            try {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                }
            } catch (InputMismatchException ignore) {
            }
        }

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
    }

}
