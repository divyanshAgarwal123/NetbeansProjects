//Final keyword is used for user retriction  
//you can not change the value of final variable
//in final variable you can not change the value but you can initialise
//you cant initialise the value of final variable in only in constructor
package com.yahoo;       
public class FinalKey {
    
    FinalKey(final int a)
    {
        System.out.println(a*a*a);
    }
    public static void main(String args[])
    {
       FinalKey obj = new FinalKey(3);
        
    }
    
}
