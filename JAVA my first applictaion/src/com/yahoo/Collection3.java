/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Collection3 {
    String name;
    String book;
    String booknm;
    void show(String name,String book,String booknm)
    {
        this.book=book;
        this.booknm=booknm;
        this.name=name;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Collection3 aa = new Collection3();
        System.out.println("please enter the author name");
         String a =sc.nextLine();
         System.out.println("please enter the book name name");
         String b =sc.nextLine();
         System.out.println("please enter the publisher name");
         String c =sc.nextLine();
         aa.show(a,b,c);
         ArrayList<String> bb = new ArrayList<String>();
         bb.add(a);
         bb.add(b);
         bb.add(c);
         System.out.println("the book information is "+bb);
//         Iterator itr = bb.iterator();
//         while(itr.hasNext()){
//             System.out.println(itr.next());
         }
    }
