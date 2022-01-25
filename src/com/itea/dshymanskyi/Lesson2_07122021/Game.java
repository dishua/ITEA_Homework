package com.itea.dshymanskyi.Lesson2_07122021;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int wins = 0;
        int tries = 0;

        // while (answer.equals("Y")||answer.equals("y")){
        do {
            tries++;
            int a = random.nextInt(2);
            System.out.println(a);
            System.out.println("Please, enter the number 0/1");
            if (scanner.nextInt() == a) {
                wins++;
                System.out.println("You've won!");

            } else {
                System.out.println("Better luck next time. The number was:" + a);

            }
            System.out.println("You've won " +wins+"/"+tries);
            System.out.println("Do you want to try again? Type 'Y/y'");
        }
            while (scanner.next().equalsIgnoreCase("Y"));
    }
}
