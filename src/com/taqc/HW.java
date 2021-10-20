package com.taqc;

import java.util.Scanner;

public class HW {
    public static void task1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter brick params: a, b, c");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        System.out.println("Enter hole params: x, y");
        float x = input.nextFloat();
        float y = input.nextFloat();
        if ((a <= x & b <= y) & (b <= x & a <= y) &
            (a <= x & c <= y) & (c <= x & a <= y) &
            (c <= x & b <= y) & (b <= x & c <= y))
            System.out.println("The brick goes through the hole");
        else
            System.out.println("The brick does not go through");
    }
    public static void task2() {
        Scanner input = new Scanner(System.in);
        int d = 3;
        boolean b = false;
        System.out.println("Enter n: ");
        int n = input.nextInt();
        int N = n*n;
        System.out.println("n^2 = " + N);
        while ((N != 0) & (!b)) {
            if (N % 10 == d)
                b = true;
            N = N/10;
        }
        if (b)
            System.out.println("Digit " + d + " is included in the number " + N);
        else
            System.out.println("Digit " + d + " doesn't included in the number " + n);

        System.out.print("\nReverse: ");
        while (n != 0) {
            int k = n % 10;
            n = n / 10;
            System.out.print(k);
        }


        //System.out.print("\nChanged the first and last digits: " + permut);

        //stem.out.print("With adding to the end and beginning 1: " + add);

    }
    public static void task3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int r = input.nextInt();
        var p = 2 * Math.PI * r;
        var a = Math.PI * Math.pow(r, 2);
        System.out.println("Circle P: " + p + "\nCircle A: " + a);

        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Where are you live, " + name + '?');
        String adress = input.next();
        System.out.println("Hello, " + name + " from " + adress + '.');

        long startTime1 = System.nanoTime();
        int c1 = 440, c2 = 320, c3 = 760;
        int t1 = 340, t2 = 430, t3 = 560;
        int total1 = t1 * c1;
        int total2 = t2 * c2;
        int total3 = t3 * c3;
        int all = total1 + total2 + total3;
        long endTime1   = System.nanoTime();
        System.out.println(("Result: " + total1 + ", " + total2 + ", " + total3 + " = " + all + ". Took time separately: " + (endTime1 - startTime1) + "ns"));
        long startTime2 = System.nanoTime();
        int total = t1 * c1 + t2 * c2 + t3 * c3;
        long endTime2   = System.nanoTime();
        System.out.println(("Result: " + total + ". Took time together: " + (endTime2 - startTime2) + "ns"));
    }
}
