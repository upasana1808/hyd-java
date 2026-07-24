package OOPS.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        //HashSet<String> set2=new HashSet<>();
        set1.add("Upasana");
        set1.add("Rohitha");
        set1.add("Nimit");
        set1.add("Bala");
        set1.add("Upasana");
        System.out.println(set1);

         Set<String> set2=new TreeSet<>();
        //HashSet<String> set2=new HashSet<>();
        set2.add("Upasana");
        set2.add("Rohitha");
        set2.add("Nimit");
        set2.add("Bala");
        set2.add("Upasana");
        System.out.println(set2);
    }
}
