package com.taqc;

import java.util.*;

public class HW {
    public static void task1() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter brick params: a, b, c");
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
            System.out.println("The brick does not go through\n");
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

        System.out.println("\n2.1.");

        boolean b = false;
        while ((N != 0) && (!b)) {
            if (N % 10 == 3) b = true;
            N = N / 10;
        }

        if (b)
            System.out.println("Digit 3 included in " + N);
        else
            System.out.println("Digit 3 isn't included in" + N);

        System.out.println("\n2.2.");

        int reverse_n = 0, tmp, c_n = n;
        do {
            tmp = c_n % 10;
            reverse_n = (reverse_n * 10) + tmp;
            c_n = c_n / 10;
        } while (c_n > 0);
        System.out.println("Reverse number: " + reverse_n);

        System.out.println("\n2.3.");

        int begin, middle = 0, pos = 1;
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

        System.out.println("\n2.4.");

        int result, first_1 = 10;
        c_n = n;
        while (c_n != 0) {
            c_n /= 10;
            first_1 *= 10;
        }
        result = first_1 + n * 10 + 1;
        System.out.println("Digit \"1\" included:  " + result + "\n");
    }

    public static void task3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 3.1.\nEnter radius: ");
        int r = input.nextInt();
        var p = 2 * Math.PI * r;
        var a = Math.PI * Math.pow(r, 2);
        System.out.println("Circle P: " + p + "\nCircle A: " + a);

        System.out.println("\nTssk 3.2.\nWhat is your name?");
        String name = input.next();
        System.out.println("Where are you live, " + name + '?');
        String adr = input.next();
        System.out.println("Hello, " + name + " from " + adr + '.');

        System.out.println("\nTask 3.3. ");
        long startTime1 = System.nanoTime();
        int c1 = 440, c2 = 320, c3 = 760;
        int t1 = 340, t2 = 430, t3 = 560;
        int total1 = t1 * c1;
        int total2 = t2 * c2;
        int total3 = t3 * c3;
        int all = total1 + total2 + total3;
        long endTime1 = System.nanoTime();
        System.out.println(("Result:\nTotal cost c1: " + total1 + "$,\nTotal cost c2: " + total2 + "$,\nTotal cost c3: " + total3 + "$.\nTotal cost: " + all + "$. Took time separately: " + (endTime1 - startTime1) + "ns"));
        long startTime2 = System.nanoTime();
        int total = t1 * c1 + t2 * c2 + t3 * c3;
        long endTime2 = System.nanoTime();
        System.out.println(("Result:\nTotal cost: " + total + "$.\nTook time together: " + (endTime2 - startTime2) + "ns"));
    }

    public static void task4() {
        Person person1 = new Person();
        person1.Input();
        person1.output();
        person1.Age();
        person1.ChangeName();
        person1.output();
        System.out.print("\n");

        Person person2 = new Person();
        person2.Input();
        person2.output();
        person2.Age();
        person2.ChangeName();
        person2.output();
        System.out.print("\n");

        Person person3 = new Person();
        person3.Input();
        person3.output();
        person3.Age();
        person3.ChangeName();
        person3.output();
        System.out.print("\n");


        Person person4 = new Person();
        person4.Input();
        person4.output();
        person4.Age();
        person4.ChangeName();
        person4.output();
        System.out.print("\n");

        Person person5 = new Person();
        person5.Input();
        person5.output();
        person5.Age();
        person5.ChangeName();
        person5.output();

    }

    public static void task5() {
        Scanner input = new Scanner(System.in);
        Fifth func = new Fifth();
        System.out.print("\nTask 5.1.1\nInput first float number: ");
        float n1 = input.nextFloat();
        func.rangeCompare(n1);

        System.out.print("Input second float number: ");
        float n2 = input.nextFloat();
        func.rangeCompare(n2);

        System.out.print("Input third float number: ");
        float n3 = input.nextFloat();
        func.rangeCompare(n3);

        System.out.println("\nTask 5.1.2\n");
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Maximum value in the array is: " + func.max(array));
        System.out.println("Minimum value in the array is: " + func.min(array));

        System.out.print("\nTask 5.1.3\nInput code (400-405): ");
        int code = input.nextInt();
        func.HTTPError(code);

        System.out.println("\nTask 5.2\n");
        Dog dog1 = new Dog("Verdana", Breeds.MALAMUTE, 11);
        Dog dog2 = new Dog("Kiki", Breeds.POODLE, 2);
        Dog dog3 = new Dog("Vasyl", Breeds.GOLDEN_RETRIEVER, 4);

        String new_name;
        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("Please rename the dog," + dog2.getName() + " with age " + dog2.getAge() + ", name already taken. New name: ");
            new_name = input.next();
            dog2.setName(new_name);
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("Please rename the dog, " + dog3.getName() + " with age " + dog3.getAge() + ", name already taken. New name: ");
            new_name = input.next();
            dog3.setName(new_name);
        } else if (dog3.getName().equals(dog1.getName())) {
            System.out.println("Please rename the dog, " + dog3.getName() + " with age " + dog3.getAge() + ", name already taken. New name: ");
            new_name = input.next();
            dog3.setName(new_name);
        }

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            dog1.output();
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            dog2.output();
        } else if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog1.getAge()) {
            dog3.output();
        }

        if (dog1.getAge() == dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            dog1.output();
            dog2.output();
        } else if (dog2.getAge() == dog3.getAge() && dog2.getAge() > dog1.getAge()) {
            dog2.output();
            dog3.output();
        } else if (dog3.getAge() == dog1.getAge() && dog3.getAge() > dog2.getAge()) {
            dog1.output();
            dog3.output();
        }
    }

    public static void task6() {
        new User("Vitaliy", 35, Sex.MALE);
        new User("Masha", 34, Sex.FEMALE);
        new User("Ariana", 7, Sex.FEMALE);


        System.out.println("All users:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("All users: MALE");
        User.getAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("All users: FEMALE");
        User.getAllUsers(Sex.FEMALE).forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       all users: " + User.getHowManyUsers());
        System.out.println("  all users MALE: " + User.getHowManyUsers(Sex.MALE));
        System.out.println("all users FEMALE: " + User.getHowManyUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       total users age: " + User.getAllAgeUsers());
        System.out.println("  total users age MALE: " + User.getAllAgeUsers(Sex.MALE));
        System.out.println("total users age FEMALE: " + User.getAllAgeUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       average users age: " + User.getAverageAgeOfAllUsers());
        System.out.println("  average users age MALE: " + User.getAverageAgeOfAllUsers(Sex.MALE));
        System.out.println("average users age FEMALE: " + User.getAverageAgeOfAllUsers(Sex.FEMALE));
        System.out.println("================================================");
    }

}

class Person {
    private String name;
    private int year;
    private final int curDate = Calendar.getInstance().get(Calendar.YEAR);

    Person() {
    }

    Person(String name, int birthYear) {
        this.name = name;
        this.year = birthYear;
    }

    void Age() {
        System.out.println("Age: ");
        System.out.println(curDate - this.year);
    }

    void Input() {
        System.out.print("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("Enter birthYear: ");
        year = sc.nextInt();

    }

    void output() {
        System.out.println("Name:" + name + " birthYear: " + year);
    }

    void ChangeName() {
        System.out.print("Change Name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }


}

class Fifth {
    public boolean rangeCompare(float num) {
        if ((num >= -5 && num <= 5)) {
            System.out.println("Number is belong to the range [-5;5]");
            return true;
        } else {
            System.out.println("Number isn't belong to the range [-5;5]");
            return false;
        }
    }

    public int max(int[] array) {
        int max = 0;

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public void HTTPError(final int code) {
        HTTPError[] errors = HTTPError.values();
        for (HTTPError er : errors) {
            if (code == er.getCode())
                System.out.println(er);
        }
    }
}

enum HTTPError {
    Bad_Request(400), Unauthorized(401), Payment_Required(402), Forbidden(403), Not_Found(404), Method_Not_Allowed(405);

    private final int code;

    HTTPError(int code) {
        this.code = code;
    }

    public final int getCode() {
        return code;
    }
}

class Dog {
    private String name;
    private Breeds breed;
    private int age;

    public Dog(String name, Breeds breed, int age) {
        this.name = name;
        this.breed = breed;
        if (age < 0) {
            this.age = 0;
        } else this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breeds getBreed() {
        return breed;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else this.age = age;
    }

    public void output() {
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + this.breed);
        System.out.println("Age: " + this.age);
    }
}

enum Breeds {
    AKITA,
    POODLE,
    DACHSHUND,
    MALAMUTE,
    GOLDEN_RETRIEVER,
    SHIBU_INU
}
