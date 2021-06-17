/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
interface VC
{
    int x= 123;
}

interface myhome
{
    int y = 12;
}

public class Interface4 implements VC,myhome {
    public void show(){
            int x = 12;
            int y = 13;        
             System.out.println(x);
             System.out.println(y);
             System.out.println(VC.x);
             System.out.println(myhome.y);
        }
            public static void main(String args[]){
                Interface4 ii = new Interface4();
                ii.show();
            }
}
