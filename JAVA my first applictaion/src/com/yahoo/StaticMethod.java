/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

/**
 *
 * @author divya
 */
public class StaticMethod {
    int a=10;
    int b=12;
    static int c=13;
    static void show(){
        StaticMethod aa=new StaticMethod();
                
        System.out.println("the static number is "+c);
        System.out.println("the non static number are "+aa.a+" and "+aa.b);
    }
    public static void main(String args[]){
        StaticMethod aa=new StaticMethod();
        aa.show();
   } 
}
