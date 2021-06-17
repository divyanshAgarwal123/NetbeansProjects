/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//this is also used for current class constructor.
//1.This is a used for current class object
//2.this is to call current class function.
//3.this is used to call current class constructor.
//4.this is also used for diffrentiate between global on local variable
package com.yahoo;

import java.util.Scanner;

public class ThisExp3 {   
    ThisExp3(){
        String a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter a name");
        a=sc.nextLine();
        System.out.println("please enter a name");
        b=sc.nextLine();
        System.out.println("hello "+a+b);
        
    }
    ThisExp3(int x,int y){
        Scanner ab= new Scanner(System.in);
        System.out.println("please enter a number");
        x = ab.nextInt();
        System.out.println("please enter a number");
        y=ab.nextInt();
        System.out.println(x+y);
       
    }
    

        public static void main(String args[]){
            ThisExp3 obj = new ThisExp3();
            ThisExp3 aa = new ThisExp3(1,0);
        }
}

