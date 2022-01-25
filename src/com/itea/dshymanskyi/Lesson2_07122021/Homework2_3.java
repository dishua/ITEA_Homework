package com.itea.dshymanskyi.Lesson2_07122021;
/*Задача №3
Необходимо вывести в консоль таблицу умножения на 3. В консоли должно будет:

3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30 */

public class Homework2_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);
        }
    }
}
