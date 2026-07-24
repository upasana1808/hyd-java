package OOPS.arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner scn=new Scanner(System.in);
        // num[0]=100;
        // num[1]=200;num[2]=300;num[3]=400;num[4]=500;
        System.out.println("Enter numbers");
        for(int i=0;i<num.length;i++)
        {
            num[i]=scn.nextInt();
        }
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
       for(int temp:num)
       {
        System.out.println(temp);
       }

        String[] names=new String[5];
        System.out.println("Enter numbers");
        for(int i=0;i<names.length;i++)
        {
            names[i]=scn.next();
        }

        for(String temp:names)
       {
        System.out.println(temp);
       }

       Book[] listOfBooks=new Book[2];
       Book b1=new Book();
       Book b2=new Book();
       listOfBooks[0]=b1;
       listOfBooks[1]=b2;


    }

}
