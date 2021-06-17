package com.yahoo;
class Q
{
    Q(int a){ 
        int b = 23;
        int c =a+b;  
        System.out.println(c);
    }

}
    public class Super2 extends Q
    {
        Super2(){
            super(12);
            int a=13;
            int b =23;
            int c =a+b;
            System.out.println(c);
}
        public static void main(String args[]){
            Super2 aa = new Super2(); 
    } 
    }

