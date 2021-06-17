package com.yahoo;
import java.util.Scanner;
public class Overloading {
    void show(){
        System.out.print("hello");
    }
    void show(int x,int y){
        Scanner sc =new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("the answer is"+(x+y));
        
    }
    public static void main(int a){
        System.out.print(a);
    }
    public static void main(String args[]){
        Overloading aa = new Overloading();
        aa.show();
        aa.show(0, 0);
        System.out.println("raj"+"kumar");
        System.out.println(200 + 300);
        System.out.println(45.5+"raj"+"sharma"+34+35);
        main(1);
    }
    
}
