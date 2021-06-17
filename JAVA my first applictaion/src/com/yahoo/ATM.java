package com.yahoo;

import java.util.Scanner;
public class ATM {
    int a;
    int b;
    int c = 2000;
    int d;
    int r;
    int hello;
    int label;
    Scanner sc= new Scanner(System.in);
    void pass(){
        System.out.println("WELCOME To The Bank");
        System.out.println("Please enter your password");
        a=sc.nextInt();
        if(a==1234)
        {
            System.out.println("GoodMorning");
            System.out.println("Press 1 to check your current balance\nPress 2 to deposit \nPrees 3 for withdraw");
            b=sc.nextInt();
            if(b==1)
            {
                System.out.println("your current balance is:"+c);
            }
            if(b==2)
            {
                System.out.println("How much money do you want to deposit");
                d=sc.nextInt();
                r=c+d;
                System.out.println("Ok now Your current balance is "+r);
            }
            if(b==3){
                System.out.println("How much money do you want to withdraw");
                hello=sc.nextInt();
                if(hello<=c){
                    r=c-hello;
                    System.out.println("OK now Your current balance is "+r);
                }
                else{
                     System.out.println("you have insufficient balance");
                }
            }
        }
        else{
           System.out.println("Sorry tour password is incorrect");
        }
    }    
        public static void main(String args[]){
            ATM aa = new ATM();
            aa.pass();
    }
}
