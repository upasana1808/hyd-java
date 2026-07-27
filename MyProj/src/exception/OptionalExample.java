package exception;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] names=new String[5];
        Optional<String> check=Optional.ofNullable(names[4]);//chcek if it is null
        if(check.isPresent())
        {      
            String temp=names[4].toLowerCase();
             System.out.println(temp);
        }else
            System.out.println("No value found");
    }

}
