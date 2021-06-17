/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

import java.util.Scanner;

/**
 *
 * @author divya
 */
public class StringTypes {
    public static void main(String args[])
    {
             //Scanner sc = new Scanner(System.in);
//            System.out.println("please enter a name");
//            int length = sc.nextLine().length();
//             System.out.println(length);
                //First way of creating string objects
                String name = "divyanshagarwal";
                //another way of creating String Object
                String name1 = new String("Aptech");
                System.out.println(name.substring(0,8));
                System.out.println(name.substring(8));
                
    }
}
