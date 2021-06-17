/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yahoo;
class G
{
    String show(){
       String a="hello";
       String b="how are you";
       return a+b;
    }
}
public class Overriding extends G {
    @Override
    public String show(){
        String a = "divyansh";
        String b="agarwal";
        return a+b;
    }
    public static void main(String args[]){
        G aa = new Overriding();
        String c = aa.show();
        System.out.println(c);
    }
}
