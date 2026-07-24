package OOPS.usecase;

public class Test {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Coder c=new Coder();
        Designer d=new Designer();
        Payroll pp=new Payroll();
       System.out.println( pp.calSal(e1));
        System.out.println( pp.calSal(c));
        System.out.println( pp.calSal(d));
    }

}
