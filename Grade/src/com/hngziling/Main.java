package com.hngziling;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double mark;

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your mark: ");
        mark = scan.nextDouble();

        System.out.println(Grade.getGrade(mark));
    }
}
