/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yahoo;

interface O
{
    void display();
}
interface X
{
    void show();
}
class I implements O
{
    @Override
    public void display()
    {
        System.out.println("Hello its I");
    }
}
class T implements O
{
    @Override
    public void display()
    {
        System.out.println("Hello its T");
    }
}
class P implements O,X
{
    @Override
    public void display(){
        System.out.println("Hello its P");
    }
    @Override
    public void show(){
        System.out.println("Hello its P");
    }
}
public class Hybrid {
    public static void main(String args[]){
       T tt = new T();
       tt.display();
       P pp = new P();
       pp.show();
       
    }
}
