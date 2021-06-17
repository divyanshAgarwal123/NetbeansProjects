/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//extends keyword is used to make a relationship between 2 classes
package com.yahoo;

import java.util.Scanner;

    class Hello
    {
        int a=30;
    
    }
    public class Inheritence extends Hello  //extends keyword is used to achieve inheritence
    {
        void display()
        {
          
          Scanner sc= new Scanner(System.in);
          System.out.println("value before change is :"+a);
          System.out.println("Change the value of a");
          a=sc.nextInt();
          System.out.println("value after change is :"+a);
        }
    
    public static void main(String args[])
    {
        Inheritence obj = new Inheritence();
        obj.display();
    }
}
