/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

import java.util.Scanner;

class MyException extends Exception
{
    
}
public class CustomException2 extends MyException {
            void show()throws MyException
            {
               try
               {
                int a;
                Scanner sc = new Scanner(System.in);
                System.out.println("enter a number");
                 a=sc.nextInt();
                 throw new MyException();
               }
               catch(MyException b)
                       {
                          System.out.println("Build Successful"); 
                       }
            }
            public static void main (String args[]) throws MyException{
                CustomException2 aa = new CustomException2();
                aa.show();
            }
}
