package OOPS.inheritance;

public class Manager extends Employee {
    String team;
    public Manager(){}
    public Manager(String name, int age,int empId,String team){
        super(name,age,empId); // call to contructor of super class
        this.team=team;
        System.out.println("Manager created");
    }
     public void show(){
        System.out.println(name+" "+age+" "+empid+" "+team);
    }
    
}
