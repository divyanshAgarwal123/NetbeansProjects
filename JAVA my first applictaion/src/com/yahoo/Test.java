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
public class Test {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name");
        String a = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.reverse();
        System.out.println(builder);
    }
    
}
