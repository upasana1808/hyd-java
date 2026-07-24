package OOPS.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", "Electronics", 75000.00, 10, "Dell", 4.7, true));
        products.add(new Product(102, "Smartphone", "Electronics", 55000.00, 15, "Samsung", 4.6, true));
        products.add(new Product(103, "Wireless Mouse", "Accessories", 999.00, 100, "Logitech", 4.5, true));
        products.add(new Product(104, "Mechanical Keyboard", "Accessories", 3999.00, 50, "Redragon", 4.4, true));
        products.add(new Product(105, "Office Chair", "Furniture", 8500.00, 20, "IKEA", 4.3, true));
        products.add(new Product(106, "Water Bottle", "Kitchen", 499.00, 0, "Milton", 4.1, false));
        products.add(new Product(107, "Air Fryer", "Home Appliances", 6999.00, 12, "Samsung", 4.8, true));
        products.add(new Product(108, "LED TV", "Electronics", 42000.00, 8, "Sony", 4.9, true));
        products.add(new Product(109, "Running Shoes", "Sports", 3500.00, 35, "Samsung", 4.2, true));
        products.add(new Product(110, "Coffee Maker", "Home Appliances", 5999.00, 5, "Prestige", 4.0, true));
        products.add(new Product(111, "Smartphone", "Electronics", 11000.00, 15, "Samsung", 4.6, true));
        //get the names of all the products where price>5000

        List<String> prodNames=products.stream()
                                .filter(p->p.getPrice()>7000)// product objects
                                .map(p->p.getProductName())
                                .collect(Collectors.toList());
        System.out.println(prodNames);
            List<String> prodNames1=products.stream()
                                .filter(p->p.getPrice()>5000)// product objects
                                .filter(p->p.getBrand().equals("Samsung"))
                                .map(p->p.getProductName())
                                .collect(Collectors.toList());
        System.out.println(prodNames1);
         Set<String> prodSet=products.stream()
                                .filter(p->p.getPrice()>5000)// product objects
                                .filter(p->p.getBrand().equals("Samsung"))
                                .map(p->p.getProductName())
                                .collect(Collectors.toSet());
        System.out.println(prodSet);

        Map<Integer,String> mm=products.stream().collect(Collectors.toMap(p->p.getProductId(),p->p.getProductName()));
        System.out.println(mm);

        Long count=products.stream().count();
        System.out.println(count);

    }

}
