package com.taqc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Choose a task: \n 1-6 or 0 to exit");
            String c = input.next();
            switch (c) {
                case ("1") -> HW.task1();
                case ("2") -> HW.task2();
                case ("3") -> HW.task3();
                case ("4") -> HW.task4();
                case ("5") -> HW.task5();
                case ("6") -> HW.task6();
                case ("0") -> System.exit(0);
                default -> System.out.println("Incorrect input");
            }
        }
    }
}
