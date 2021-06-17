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
public class This2 {
    int a=4;
    int b=5;
    Scanner sc= new Scanner(System.in);
    void show(){
        int a=2;
        int b=3;
        System.out.print("enter the student roll no."+a);
        System.out.println("enter the student name"+b);
        
        System.out.print("enter the student roll no."+this.a);
        System.out.println("enter the student name"+this.b);     
    }
    public static void main(String args[]){
        ThisKeyword obj =new ThisKeyword();
        obj.display();
    }
    
}
