/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

public class handlingExample4 {
        public static void main(String args[]){
            try
            {
            int a[]=new int[5];
            a[4]=34;
            }
            catch(ArithmeticException o){
                System.out.println("hello");
            }
            catch(ArrayIndexOutOfBoundsException o){
                System.out.println("exception handeled");
            }
            catch(Exception o){
                System.out.println(o);
            }
        }
}
