/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
interface Bank
{
    float Roi();   
}
class SBI implements Bank
{   
    public float Roi()
    {
        int a = 2000;
        int b = 2;
        float c = 9.15f;  
        return(a*b*c/100);
    }
}
class PNB implements Bank
{   
    public float Roi()
    {
        int a = 2000;
        int b = 2;
        float c = 9.7f;  
        return(a*b*c/100);
    }
}
public class Interface2 {
        public static void main(String args[]){
            
        }
}
