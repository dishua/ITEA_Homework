package com.itea.dshymanskyi.Lesson2_07122021;

/*Задача №6
Необходимо вывести в консоль следующую последовательность цифр:
1 2 4 8 16 32 64 128 256 512 */

public class Homework2_6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 512; i += i) {
            System.out.print(i + " ");
        }

    }
}
