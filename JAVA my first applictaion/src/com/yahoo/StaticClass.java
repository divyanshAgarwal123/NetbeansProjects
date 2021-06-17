/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

public class StaticClass {
    
    int roll = 30;
    static class inner{
        static void show(){
            StaticClass obj =new StaticClass();
            System.out.println(obj.roll); 
        }   
    }
    public static void main(String args[]){
        StaticClass.inner obj =new StaticClass.inner();
        obj.show();
    }
}
