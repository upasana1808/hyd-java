package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.model.Book;
import com.example.model.Car;

public class Main {
    public static void main(String[] args) {
       
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Book book1=context.getBean(Book.class);
        Car car1=context.getBean(Car.class);
        //Book book1=new Book();
    }
}