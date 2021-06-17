/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//constructor is a special type of method that is invoke automatically at the time of object creation
package com.yahoo;                                                              

import java.util.Scanner;

/**
 *
 * @author divya
 */
public class ConstructorExample {
    
    ConstructorExample(){
        String a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter a name");
        a=sc.nextLine();
        System.out.println("please enter a name");
        b=sc.nextLine();
        System.out.println("hello "+a+b);
    }
    ConstructorExample(int x,int y){
        Scanner ab= new Scanner(System.in);
        System.out.println("please enter a number");
        x = ab.nextInt();
        System.out.println("please enter a number");
        y=ab.nextInt();
        System.out.println(x+y);
       
    }
    

        public static void main(String args[]){
            ConstructorExample obj = new ConstructorExample();
            ConstructorExample aa = new ConstructorExample(1,0);
        }
}
