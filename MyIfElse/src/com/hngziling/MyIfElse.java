package com.hngziling;
import java.util.Scanner;

public class MyIfElse {

    public static void main (String[] Args) {

        double mark;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your mark: ");
        mark = scan.nextDouble();

        if (mark >= 89.45 && mark <= 100){
            System.out.println("A+  Cemerlang");
        }
        else if (mark >= 79.45 && mark <= 89.44){
            System.out.println("A   Cemerlang");
        }
        else if (mark >= 74.45 && mark <= 79.44){
            System.out.println("A-  Kepujian");
        }
        else if ( mark >= 69.45 && mark <= 74.44){
            System.out.println("B+  Kepujian");
        }
        else if ( mark >= 64.45 && mark <= 69.44){
            System.out.println("B   Kepujian");
        }
        else if ( mark >= 59.45 && mark <= 64.44){
            System.out.println("B-  Baik");
        }
        else if ( mark >= 54.45 && mark <= 59.44){
            System.out.println("C+  Baik");
        }
        else if ( mark >= 49.45 && mark <= 54.44){
            System.out.println("C   Lulus");
        }
        else if ( mark >= 44.45 && mark <= 49.44){
            System.out.println("C-  Gagal");
        }
        else if ( mark >= 39.45 && mark <= 44.44){
            System.out.println("D+  Gagal");
        }
        else if ( mark >= 34.45 && mark <= 39.44){
            System.out.println("D   Gagal");
        }
        else if (mark >= 0.01 && mark <= 34.44){
            System.out.println("F   Gagal");
        }
        else {
            System.out.println("Skor tidak sah");
        }

    }
}
