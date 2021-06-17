/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
class ASD
{
    void show()
    {
        int i,n=0;
        int j;
        String a="\n";
        
        for(i=1;i<=10;i++)
        {
            
            for(j=1;j<=i;j++)
            {
                n=n+1;
                System.out.print(n);
            }
           System.out.print("\n");
        }
    }
}
public class Looptest {
        public static void main(String[] args) {
            ASD aa=new ASD();
            aa.show();
        }
}
