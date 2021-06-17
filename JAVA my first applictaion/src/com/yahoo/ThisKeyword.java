/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//1.This is a used for current class object
//2.this is to call current class function.
//3.this is used to call current class constructor.
//4.this is also used for diffrentiate between global on local variable
package com.yahoo;

import java.util.Scanner;

/**
 *
 * @author divya
 */
public class ThisKeyword {
    int a;
    String b;
    Scanner sc= new Scanner(System.in);
    void show(int ab,String bc){
        a=ab;
        b=bc;
        System.out.print("enter the student roll no.");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("enter the student name");
        b = sc.nextLine();       
    }
    void display(){
        show(a, b);
        System.out.println("Student roll no. is"+ a+"\n"+"Student name is"+b);
    }
    public static void main(String args[]){
        ThisKeyword obj =new ThisKeyword();
        obj.show(1,"s");
        obj.display();
    }
}
