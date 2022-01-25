package com.itea.dshymanskyi.Lesson1_03122021;

/*1 - Написать в (public static void main) методе код,
проверяющий и сообщающий в консоль, является ли целое число записанное в переменную a, чётным либо нечётным.

пример вывода:
имея int a=5

результат должен быть таким:
Число 5 - нечетное

либо имея int а=4,

результат должен быть таким:
Число 4 - четное */

public class Homework1_1 {
    public static void main(String[] args) {
        int a = 10;

        if (a % 2 == 0) {
            System.out.println(a + " Четное число");
        } else {
            System.out.println(a + " Нечетное число");
        }
    }
}
