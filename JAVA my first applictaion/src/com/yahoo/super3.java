package com.yahoo;
class H{
    void show(){
        System.out.println("this is parent class");
    }
}
public class super3 extends H {
    @Override
    void show(){
        System.out.println("this is child class");
        super.show();
    }
    public static void main(String args[]){
    super3 aa = new super3();
    aa.show();
    }              
}
