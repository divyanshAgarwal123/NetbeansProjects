package com.yahoo;
class person
{ int id ;
  String name;
    person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class emp extends person
{
    float salary;
    emp(int id,String name,float salary){
        super(id,name);
        this.salary=salary;
        
    }
    void display(){
        System.out.println("the id is"+id+"the name is"+name+"the salary is"+salary);
    }
}        
public class super4 {
        public static void main(String args[]){
    emp aa = new emp(1,"ankit",45000f);
    aa.display();
    } 
}
