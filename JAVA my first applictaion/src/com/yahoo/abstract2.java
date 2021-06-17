/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;
interface NM
{
   public void a();
    public void b();
    public void c();
    public void d();
        }
abstract class JH implements NM{
    void show(){
        System.out.println((12+13));
    }
}
class C implements NM
{
    public void a(){
        System.out.println((12+13));
    }
    public void b(){
        System.out.println((12+13));
    }
    public void c(){
        System.out.println((12+13));
    }
    public void d(){
        System.out.println((12+13));
    }
}
public class abstract2 {
                public static void main(String args[]){
                    C cc = new C();
                    cc.a();
                    cc.b();
                    cc.c();
                    cc.d();
                }
}
