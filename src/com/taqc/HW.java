package com.taqc;

import java.util.Calendar;
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
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        while (n <= 0) {
            System.out.println("Negative number.\nInput valid data: ");
            n = in.nextInt();
        }
        int N;
        System.out.println("n^2 = " + (Math.pow(n, 2)));
        N = (int) Math.pow(n, 2);

        System.out.println("2.1.\n");

        boolean b = false;
        while ((N != 0) && (!b)) {
            if (N % 10 == 3) b = true;
            N = N / 10;
        }

        if (b)
            System.out.println("Digit 3 included in " + N);
        else
            System.out.println("Digit 3 isn't included in" + N);

        System.out.println("2.2.\n");

        int reverse_n = 0, tmp, c_n = n;
        do {
            tmp = c_n % 10;
            reverse_n = (reverse_n * 10) + tmp;
            c_n = c_n / 10;
        } while (c_n > 0);
        System.out.println("Reverse number: " +reverse_n);

        System.out.println("2.3.\n");

        int  begin, middle = 0, pos = 1;
        c_n = n;
        begin = c_n % 10;
        c_n = c_n / 10;
        while (c_n > 9) {
            begin *= 10;
            middle += (c_n % 10) * pos;
            pos *= 10;//10  100
            c_n /= 10;
        }
        c_n = (begin * 10) + (middle * 10) + c_n;
        System.out.println("first and last digits replaced: " + c_n);

        System.out.println("2.4.\n");

        int result, first_1 = 10;
        c_n = n;
        while (c_n != 0) {
            c_n /= 10;
            first_1 *= 10;
        }
        result = first_1 + n * 10 + 1;
        System.out.println("Digit \"1\" included:  " + result);
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
    public static void task4() {
        Scanner input = new Scanner(System.in);
        boolean state = true;
        String name;
        int year;
        while(state == true) {
        System.out.println("Choose 1-4, or 0 to exit\n1.Input personal data.\n2.Output personal data.\n3. Calculate the age.\n4. Change name.");
        int c = input.nextInt();
        Person[] personList = new Person[5];
            switch(c) {
                case(1):
                    for(int i = 0; i < 5; i++) {
                        System.out.print("Name: ");
                        name = input.next();
                        System.out.print("Year: ");
                        year = input.nextInt();
                        personList[i] = new Person(name, year);
                    }
                    break;
                case(2):
                    Person.OutData();
                    break;
                case(3):
                    Person.age();
                    break;
                case(4):
                    Person.changeName();
                    break;
                case(0):
                    state = false;
                    System.exit(0);
                default:
                    System.out.println("Invalid data");
            }
        }

    }
    public static void task5() {

    }
    public static void task6() {

    }
}

class Person {
    private static String name;
    private static int year;
    static int curYear = Calendar.getInstance().get(Calendar.YEAR);
    int age;

    public Person()
    {
        name = "";
        year = 0;
    }

    public Person(String nameVal, int yearVal) {
        name = nameVal;
        year = yearVal;
    }

    static void InData(String name, int year) {
        Person.name = name;
        Person.year = year;
    }

    static void OutData() {
            System.out.println("Name: " + name + ".\nBirth year: " + year + ".\n");
    }

    public static void age() {
        System.out.println("Person age: " + (curYear - year));
    }

    public static void changeName() {

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

}

