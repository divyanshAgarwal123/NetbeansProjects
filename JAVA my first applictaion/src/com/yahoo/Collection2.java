// -> lambda expression
package com.yahoo;

import java.util.ArrayList;
import java.util.LinkedList;

class ALD
{
         int rollno;
         double fees;
         String name;    
    ALD(int rollno,double fees,String name)
    {
        this.rollno = rollno;
        this.fees = fees;
        this.name = name;
        
        
        
    }
}
public class Collection2 {
            public static void main(String args[]){
                ALD aa =new ALD(12,123.5,"divyansh");
                ALD bb =new ALD(123,123.6,"agarwal");
                LinkedList<ALD> ar=new LinkedList<ALD>();
                ar.add(aa);
                ar.add(bb);
                //For each loop
                //for(ALD ae:ar) 
                //{
                   // System.out.println(ae.rollno);
                    //System.out.println(ae.fees);
                  //  System.out.println(ae.name);
                //}
                // for each method 
                ar.forEach(e->{
                  System.out.println(e.fees+""+e.name+""+e.name);  
                });
            }
}
