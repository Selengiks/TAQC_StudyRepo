package com.taqc;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Choose a task: \n 1, 2, 3 or 0 to exit");
            var c = input.next();
            switch(c) {
                case("1"):
                    HW.task1();
                case("2"):
                    HW.task2();
                case("3"):
                    HW.task3();
                case("0"):
                    System.exit(0);
                default:
                    System.out.println("Incorrect input");
            }
        }
    }
}
