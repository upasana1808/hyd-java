package OOPS.inheritance;

public class Test {
    public static void main(String[] args) {
        //Person p=new Person();
       // Employee e=new Employee();
        Manager m=new Manager("Uppu",32,101,"training");        
        m.show();
        Person p1=new Employee();
        Person p2=new Manager();
        Employee e1=new Manager();
    }
    
}
