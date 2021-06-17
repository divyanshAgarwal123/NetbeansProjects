/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

import java.util.InputMismatchException;
import java.util.Scanner;

class DEF
{
    void show()
    {
                System.out.println("Hello");
    }
}

public class handlingExample2 extends DEF{
        Scanner sc= new Scanner(System.in);
        @Override
    void show()
    {
        try
        {
            int a;
            System.out.println("enter first number");
            a=sc.nextInt();
            System.out.println("the number is "+a);
        }
        catch(InputMismatchException m)
                {
                   System.out.println("you entered a string in int variable"); 
                }
        finally
        {
            System.out.println("the code is finally executed");
        }
    }
        public static void main(String args[]){
            handlingExample2 aa = new handlingExample2();
            aa.show();
        }
    
}
