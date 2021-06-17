/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
interface draw
{
    void Draw();
    default void show(){
         System.out.println((12+13));
    }
}
public class Interface5 implements draw {
    public void Draw(){
                System.out.println((12+13));
    }
            public static void main(String args[]){
                draw d = new Interface5();
                d.show();
                d.Draw();
            }
    
}
