
package com.yahoo;

import java.util.Scanner;

class A{
    void display(){
        int b,x;
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter a number");
         b=sc.nextInt();
        for( x = 1; x <= b; x = x + 1 ){
            System.out.println(x);
        }
    
    }
}
class B{
    void show(){
        String a,b;
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter a name");
        a=sc.nextLine();
        System.out.print("please enter a name");
        b=sc.nextLine();
        System.out.print("hello "+a+b);
        
    }
}

public class objects {
        public static void main(String args[]){
            A aa=new A();
            aa.display();
            B bb=new B();
            bb.show();
        }
}
