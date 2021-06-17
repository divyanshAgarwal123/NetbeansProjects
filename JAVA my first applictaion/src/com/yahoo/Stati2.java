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
public class Stati2 {
    int roll;
    String name;
    static String collage="KFC";
    
    static void show(){
        collage="modernschool";
    }
    Stati2(int i,String n){
        roll=i;
        name=n;
}
    void display(){
        System.out.println(roll   +""+name+"" +collage);
    }
    public static void main(String args[]){
        Stati2.show();
        Stati2 obj=new Stati2(10,"avinash");
        Stati2 obj1=new Stati2(20,"Raju");
        obj.display();
        obj1.display();
    }
}   
