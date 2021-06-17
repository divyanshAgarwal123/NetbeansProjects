//exception is a abnormal condition that interept the normal flow of the program. 
//exception handling handles the run time error.
//there are two types of acception check and uncheck.
package com.yahoo;

import java.util.InputMismatchException;
import java.util.Scanner;

class asd
{
    Scanner sc= new Scanner(System.in);
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
    }
}
public class handlingExample 
{
        public static void main(String[] args) {
            asd aa = new asd();
            aa.show();
        }
}
