package OOPS.inheritance;

public class Employee extends Person{
    int empid;
    public Employee(String name, int age,int empId){
        super(name,age); // call to contructor of super class
        this.empid=empId;
        System.out.println("Employee created");
    }
     public void show(){
        System.out.println(name+" "+age+" "+empid);
    }
    
}
