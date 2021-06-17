/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yahoo;
class l
{
    String show(){
       String a="hello";
       String b="how are you";
       return a+b;
    }
}
public class upcasting extends l {
    @Override
    public String show(){
        String a = "divyansh";
        String b="agarwal";
        return a+b;
    }
    int add(int a ,int b)
    {
        return a+b;
        
    }
    public static void main(String args[]){
        l ll = new upcasting(); // <-upcasting or autobox
        upcasting ss = (upcasting)ll;//<-downcasting example
        String c = ll.show();  
        System.out.println(ss.add(12,23));
        System.out.println(c);
       
    }
}
