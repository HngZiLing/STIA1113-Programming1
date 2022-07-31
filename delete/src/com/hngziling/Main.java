package com.hngziling;

public class Main
{
    double n = 0.0;
    double[] a = {2.3, 4.5, 6.7, 8.9};
    int i = 2;

    public void main(String[] args)
    {
        myMethod(n);
        myMethod(a[3]);
        myMethod(a[i]);
    }

    public void myMethod(double x)
    {
        System.out.println(x);
    }
}




