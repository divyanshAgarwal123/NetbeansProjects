
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author divya
 */
public class EMIques {
    public static void main(System argss[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your principle");
        int prin = sc.nextInt();
        System.out.println("enter your principle");
        int Rate = sc.nextInt();
        System.out.println("enter your principle");
        int Time = sc.nextInt();
        int a = prin*Rate*Time/100;
        int b = prin+a;
        int c = Time*12;
        int d = b/c;
        System.out.println("The EMI is"+d);
        
    }
}
