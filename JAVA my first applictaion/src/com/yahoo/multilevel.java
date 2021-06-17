/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
class def
{
    int a=12; 
}
class red extends def
{
    int b=23;
}
public class multilevel extends red{
    void show()
    {
        System.out.println("the sum is"+(a+b));
    }
    
    public static void main(String args[]){
        multilevel obj=new multilevel();
        obj.show();        
    }
}
