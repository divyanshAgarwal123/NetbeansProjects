/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//dont allow to print duplicate elements.
package com.yahoo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
        public static void main(String args[]){
            HashSet<String> hs = new HashSet<String>();
            hs.add("ajay");
            hs.add("vijay");
            hs.add("ravi");
            Iterator<String> itr = hs.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
}
