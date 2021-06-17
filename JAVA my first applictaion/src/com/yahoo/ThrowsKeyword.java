package com.yahoo;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsKeyword {
    Scanner sc = new Scanner(System.in);
    void show() throws IOException 
    {
        int a = 40/0;
        throw new IOException("system error");
    }
    public static void main(String args[]){
        try
        {
        ThrowsKeyword aa = new ThrowsKeyword();
        aa.show();
        }
        catch(Exception s){
            System.out.println(s);
        }
    }
}
