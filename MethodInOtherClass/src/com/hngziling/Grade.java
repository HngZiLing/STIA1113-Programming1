package com.hngziling;

public class Grade
{
    public static String getGrade(double mark) {

        String grade;

        if (mark >= 89.45 && mark <= 100) {
            grade = "A+ Cemerlang";
        } else if (mark >= 79.45 && mark <= 89.44) {
            grade = "A   Cemerlang";
        } else if (mark >= 74.45 && mark <= 79.44) {
            grade = "A-  Kepujian";
        } else if (mark >= 69.45 && mark <= 74.44) {
            grade = "B+  Kepujian";
        } else if (mark >= 64.45 && mark <= 69.44) {
            grade = "B   Kepujian";
        } else if (mark >= 59.45 && mark <= 64.44) {
            grade = "B-  Baik";
        } else if (mark >= 54.45 && mark <= 59.44) {
            grade = "C+  Baik";
        } else if (mark >= 49.45 && mark <= 54.44) {
            grade = "C   Lulus";
        } else if (mark >= 44.45 && mark <= 49.44) {
            grade = "C-  Gagal";
        } else if (mark >= 39.45 && mark <= 44.44) {
            grade = "D+  Gagal";
        } else if (mark >= 34.45 && mark <= 39.44) {
            grade = "D   Gagal";
        } else if (mark >= 0.01 && mark <= 34.44) {
            grade = "F   Gagal";
        } else {
            grade = "Skor tidak sah";
        }
        return grade;
    }
}