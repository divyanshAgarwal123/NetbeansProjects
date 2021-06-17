/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//super is a keyword that is used for refer imidiate parent class
package com.yahoo;
class Z
{
    int id =12;
    String name="hello";
}
public class Super extends Z {
    int id =113;
    String name="divyansh";
    void show(){
        int id =15;
        String name="agarwal";
        System.out.println("the id is for local"+id);
        System.out.println("the name iscfor local"+name);
        System.out.println("the id is for global"+this.id);
        System.out.println("the name iscfor global"+this.name);
        System.out.println("the id is for parent global"+super.id);
        System.out.println("the name iscfor parent gloabal"+super.name);
    }
    public static void main(String args[]){
        Super aa = new Super();
        aa.show();
    }
}
