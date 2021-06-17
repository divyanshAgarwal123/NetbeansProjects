/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Collection4 {
    public static void main(String args[]){
         ArrayList<String> bb = new ArrayList<String>();
         bb.add("DIvyansh");
         bb.add("Agarwal");
         bb.add("Aman");
         System.out.println(bb);
         Collections.sort(bb);
                 
         System.out.println("after sorting "+bb);
//         Iterator itr = bb.iterator();
//         while(itr.hasNext()){
//             System.out.println(itr.next());
         }
    }
