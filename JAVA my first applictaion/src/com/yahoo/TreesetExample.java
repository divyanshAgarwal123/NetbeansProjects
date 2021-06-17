/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//make the elements in assending order
package com.yahoo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample{
        public static void main(String args[]){
            TreeSet<String> hs = new TreeSet<String>();
            hs.add("ajay");
            hs.add("vijay");
            hs.add("avi");
            Iterator<String> itr = hs.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
}
