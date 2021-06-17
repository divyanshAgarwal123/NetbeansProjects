package com.yahoo;

import java.util.Scanner;
class DivyanshException extends Exception
{
    
}
class UExample extends DivyanshException
{
    void show(int pin) throws DivyanshException
    {
        if (pin == 1234)
        {
            System.out.println("welcome");
        }
        else
        {
            throw new DivyanshException();
        }
    }
}
public class CustomException  {
        public static void main (String args[]) throws DivyanshException{
            try
            {    
                UExample aa = new UExample();
                Scanner sc = new Scanner(System.in);
                System.out.println("enter code");
                int pin=sc.nextInt();
                aa.show(pin);
            }
            catch(DivyanshException m)
                    {
                       System.out.println("Build successfull");
                    }
        }
}
      
