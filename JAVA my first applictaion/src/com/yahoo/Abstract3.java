/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
abstract class AB
{
      AB(){
          System.out.println(12+93); 
      }
    //Blog
    {
        System.out.println(12+13); 
    }
}
class NJK extends AB
{
     NJK(){
       System.out.println(12+13);  
    }
}
public class Abstract3 {
    public static void main(String args[]){
        NJK aa = new NJK();
    }
}
