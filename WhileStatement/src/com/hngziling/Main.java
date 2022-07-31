package com.hngziling;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int row;
        Scanner scan = new Scanner(System.in);
        System.out.print("The number of row: ");
        row = scan.nextInt();

        int num = 1;

        while (num <= row)
        {
            int start = 1;

            while (start <= num)
            {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
            num++;
        }
    }
}