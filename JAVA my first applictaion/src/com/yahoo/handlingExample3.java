package com.yahoo;
public class handlingExample3 {
    void show(){
        try{
            int x = 86/0;
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("hello");
        }
        finally
        {
            try{
                int data= 90/0;
            }
            catch(ArithmeticException o){
                System.out.println(o);
            }
        }
    }
    public static void main(String args[]){
        handlingExample3 aa = new handlingExample3();
        aa.show();
    }
}