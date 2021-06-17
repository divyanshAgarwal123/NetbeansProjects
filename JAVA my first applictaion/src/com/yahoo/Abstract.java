/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//a class that s used with abstact keywaord it is a abstract class(it has abstarct class and non-abstract class)
package com.yahoo;
abstract class PO
{
    abstract void show();
}

public class Abstract extends PO{
        @Override
         void show(){
          System.out.println((16+15));   
        }
        public static void main(String args[]){
            Abstract aa = new Abstract();
            aa.show();
        }
        
}
