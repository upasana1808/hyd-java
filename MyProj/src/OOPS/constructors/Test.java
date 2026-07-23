package OOPS.constructors;

public class Test {
    public static void main(String[] args) {
       //objects
       Book book1=new Book();
       book1.id=101;
       book1.title="RDPD";
       book1.author="RK";
       book1.price=100;
       
       Book book2=new Book(102,"High Living","Robin Sharma",100);
       Book book3=new Book(102,"High Living","Robin Sharma");
       book3.price=100;
    }  
    
}
