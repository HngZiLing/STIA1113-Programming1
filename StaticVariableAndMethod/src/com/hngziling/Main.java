package com.hngziling;
import java.util.Scanner;

public class Main {

    static String name;
    static int matricNumber, yearOfBirth, age;

    public static void main(String[] args)
    {
        inputMyInfo();
        calculateAge();
        printMyInfo();
    }

    public static void inputMyInfo()
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter your name: ");
        name = scan.nextLine();

        System.out.print("Enter your matric number: ");
        matricNumber = scan.nextInt();

        System.out.print("Enter your year of birth: ");
        yearOfBirth = scan.nextInt();

        System.out.println(" ");
    }

    public static void calculateAge()
    {
        age = 2020 - yearOfBirth;
    }

    public static void printMyInfo()
    {
        System.out.println("Your Name: " + name);
        System.out.println("Your Matric Number: " + matricNumber);
        System.out.println("Your Year of Birth: " + yearOfBirth);
        System.out.println("Your Age: " + age);
    }
}
