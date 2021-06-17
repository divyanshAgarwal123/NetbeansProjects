/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class TestQues2 {
    public static void main(String args[]) 
    {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("enter a name");
//        String a = sc.nextLine();
//        int n=a.length();
//        char last = a.charAt(n - 1); ;
//        char b=a.charAt(0);
//        System.out.println("the first character is"+"\t"+b+"the last character is"+"\t"+last );
        try{
        FileInputStream a = new FileInputStream("C:\\Users\\divya\\OneDrive\\Desktop\\test.txt");
                Scanner sc = new Scanner(a);
                while(sc.hasNextLine())
                        {
                            System.out.println(sc.nextLine());
                        }
        }
        catch(Exception e){
            
                    }            
    }
    
}
