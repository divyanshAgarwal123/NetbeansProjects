/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

interface show
{
    void display();
    interface Message
    {
        void msg();
    }
}
class NE implements show.Message
{
    @Override
    public void msg()
    {
        System.out.println("hellow nested interface");
    }
    public void display()
    {
         System.out.println("how are you");
    }
    
}
public class NestedInterface {
        public static void main(String args[]){
            NE ee =new NE();
            ee.msg();
            ee.display();
        }
}
