/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Static is a key that is used for memory management.
//to call a non static variable in static function you have to create a object.
package com.yahoo;

/**
 *
 * @author divya
 */
public class StaticKeyword {
    static int id;
    static String name;
    public static void main(String args[]){
   //1.   
       // id=10;
       //name="divyansh";
    //2.
        //id=10;
        //name="divyansh";
        System.out.println("The Id and the name of student is:-"+id+name);
    }
}
