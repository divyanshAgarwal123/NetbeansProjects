/*
*it is a framework that is used for achieve all the operations that we perform on data such as saerching,sorting, insertion, manipulation, and deletion..
*it is a framework that provides architechters to store and manuplate group of objects.
*/
package com.yahoo;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    void show(){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(23);
        ar.add(41);
        ar.add(12);
        ar.add(13);
        //System.out.println(ar)
        Iterator itr = ar.iterator();
         //for(Integer a:ar)
         //{
         //    System.out.println(a);
         //}
         while(itr.hasNext())
         {
             System.out.println(itr.next());
                 }
    }
    public static void main (String args[]){
        Collection aa = new Collection();
        aa.show();
    }        
}
