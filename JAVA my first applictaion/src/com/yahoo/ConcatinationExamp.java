/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

/**
 *
 * @author divya
 */
public class ConcatinationExamp {
    public static void main(String args[])
    {
        String S1="Hello";
        S1.concat("Immutable"); // IMMUTABLE
        System.out.println(S1);
        S1=S1.concat(" It is immutable");
        System.out.println(S1);
    }
    
}
