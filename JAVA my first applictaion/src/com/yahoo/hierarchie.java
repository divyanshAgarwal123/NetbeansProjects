/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

import java.util.Scanner;

class E  {
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    void display(){
        System.out.println("enter a number");
        a=sc.nextInt();
        System.out.println("enter a number");
        b=sc.nextInt();
    }
}
class F extends E{
    int c;
    
    void hello(){
       System.out.println("enter a number");
        c=sc.nextInt();
    }
    
}
public class hierarchie extends E
{
    
    void show(){
        System.out.println("the sum is "+(a+b));
    }
    public static void main(String args[]){
        hierarchie obj=new hierarchie(); 
        obj.show();
    }
}
