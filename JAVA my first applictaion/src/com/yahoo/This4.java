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

/**
 *
 * @author divya
 */
public class This4 {
    void show(This4 id){
        System.out.println("hello");
    }
    void display(){
        show(this);
    }
    public static void main(String args[]){
        This4 obj = new This4();
        obj.display();
    } 
}
