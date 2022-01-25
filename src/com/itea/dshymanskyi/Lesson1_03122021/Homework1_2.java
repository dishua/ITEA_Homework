package com.itea.dshymanskyi.Lesson1_03122021;

/*2 - Написать в (public static void main) методе код,
который переставит числа в переменных таким образом,
чтобы при выводе в консоль их последовательность оказалась возрастающей.

пример вывода:
имея int a=5,b=4,c=2;
либо int a=4,b=5,c=2;
либо int a=5,b=2,c=4;
результат должен быть таким:
последовательность - 2 4 5 */

public class Homework1_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 2;
        int d = 0;

        for (int i = 0; i <= 2; i++) {
            if (a > b) {
                d = a;
                a = b;
                b = d;
            } else if (b > c) {
                d = b;
                b = c;
                c = d;
            } else if (a > c) {
                d = a;
                a = c;
                c = d;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
