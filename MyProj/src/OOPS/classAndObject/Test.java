package OOPS.classAndObject;

public class Test {
    public static void main(String[] args) {
       //objects
       Book book1=new Book();
       book1.id=101;
       book1.title="RDPD";
       book1.author="RK";
       book1.price=100;
       book1.print();
       book1.getDiscount(10);
       int x=book1.showDiscount(20);
       System.out.println(x);
       System.out.println(book1.showDiscount(30));

       Mobile mobile1=new Mobile();
       mobile1.id=111;
       mobile1.name="Note";
       mobile1.brand="Samsung";
       mobile1.price=100000;
       mobile1.buy();
    }
    
}
