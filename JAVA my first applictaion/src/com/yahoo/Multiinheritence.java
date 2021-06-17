//interface is a blueprint of class that has static constant upstack method it is used to achieve abstraction.
package com.yahoo;
interface First
{
    void show();
}
interface Second
{
    void display();
}        
class L implements First,Second
{
    @Override
    public void show()
    {
        System.out.println("hello");
    }
    public void display(){
        System.out.println("hello");
    }
}
public class Multiinheritence {
    
    public static void main(String args[]){
    }    
}
