/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
class JK
{
    interface myhome
    {
        void show();
    }
}
public class Interface3 extends JK {
    public void show(){
            int x= 450;
             System.out.println(x);
        }
            public static void main(String args[]){
                Interface3 ii = new Interface3();
                ii.show();
            }
}
