/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

public class staticblog {
    static String bname;
    int a;
// static blog    
    static{
        
        bname="SBI";
        System.out.println("the bamk name is"+bname);
    }
//instance Blog    
    {
        a=1234;
        System.out.println("the id of bank is"+a);
        
    }
    
    public static void main(String args[]){
        staticblog aa= new staticblog();
    }    
}
