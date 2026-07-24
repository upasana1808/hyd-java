package OOPS.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        Integer i=10;
    
        ArrayList list=new ArrayList<>();
        List x=new ArrayList();
        list.add("Upasana");
        list.add(12.55f);
        list.add(1002);
        list.add(true);
        System.out.println(list);
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Upasana");
        list1.add("Samatha");
        list1.add("Aarya");
        list1.add("Navneet");
        System.out.println(list1);

         ArrayList<Book> list2=new ArrayList<>();
         list2.add(new Book(1,"aaa","bbb",23));
        list2.add(new Book(2,"ccc","ttt",23));
        System.out.println(list2);

        Iterator<Book> itr=list2.iterator();
        while(itr.hasNext()){
            Book book = itr.next();
            System.out.println(book.id);
            System.out.println(book.price);
            System.out.println(book.title);
            System.out.println(book.author);
        }

    }

}
