package OOPS.constructors;

public class Book {
    int id;
    String title;
    String author;
    int price;
    public Book(){}
    public Book(int id, String title, String author, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
       
    }
  
    
    
}
