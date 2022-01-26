package com.itea.dshymanskyi.Lesson2_07122021;

/*Задача-загадка №7 (циклы и переключатели оператора)
Представляем, что у нас есть загадка: "Что это есть такое: синий, большой, с усами и полный зайцев?" Ответ: троллейбус.
Напишите программу, которая будет считывать с консоли ответы:
у пользователя есть 3 попытки. После трех ответов программа должна завершиться;
-если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
-если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: "Троллейбус". и выходим из цикла;
-если пользователь вводит любую другую ответ, мы выводим в консоль "Подумайте еще". и продолжаем цикл. */

import java.util.Scanner;

public class Homework2_7 {
    public static void main(String[] args) {

        int attempts = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?");

        for (int attemptNumber = 1; attemptNumber <= attempts; attemptNumber++) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Сдаюсь")) {
                System.out.println("Правильный ответ: Троллейбус");
                break;
            }

            if (answer.equalsIgnoreCase("Троллейбус")) {
                System.out.println("Правильно");
                break;
            }

            int attemptsLeft = attempts - attemptNumber;

            if (attemptsLeft > 0) {
                System.out.println("Не правильно. Подумайте еще. У тебя осталось попыток " + attemptsLeft);
            }
        }
    }
}
