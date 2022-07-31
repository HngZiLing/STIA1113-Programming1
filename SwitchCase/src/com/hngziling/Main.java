package com.hngziling;
public class Main
{
    public static void main(String[] args)
    {
        int num = 10, balance;

        while (num <= 20 )
        {
            balance = num % 2;

            switch (balance)
            {
                case 0 : {
                    System.out.println(num + " is an even number");
                    break;
                }

                default: {
                    System.out.println(num + " is an invalid number");
                    break;
                }
            } num++;
        }
    }
}
