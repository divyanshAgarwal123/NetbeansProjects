/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

public class handlingExample5 {
        public static void main(String args[]){
            try
            {
                try
                {
                int a=34/0;
                }
                catch(Exception o){
                    System.out.println("exception handeled by zero");
                }
                try
                {
                    int b[]=new int[5];
                    b[4]=34;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("exception handeled by array");
                }
            }
            catch(Exception o) 
            {
                System.out.println("hellofriend how are you");
            }
 
        }
}