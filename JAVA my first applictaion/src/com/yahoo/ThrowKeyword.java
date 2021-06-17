//throw quality:
// its within the method
// single acception only
package com.yahoo;

import java.util.Scanner;

public class ThrowKeyword {
    Scanner sc = new Scanner(System.in);
    void show()
    {
        try
        {
        int a;
        int b;
        System.out.println("enter your age");
        a = sc.nextInt();
        if (a<18)
        {
            throw new ArithmeticException("you are below 18");
        }
        else
        {
            System.out.println("you are alligible to vote");
        }
        }
        catch(ArithmeticException m)
        {
            System.out.println("you are below 18");
        }
    }
    public static void main(String args[]){
        ThrowKeyword aa = new ThrowKeyword();
        aa.show();
    }
}
