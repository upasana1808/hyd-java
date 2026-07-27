package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.model.Book;
import com.example.model.Car;

@Configuration //converts it to config file
@ComponentScan("com.example")
public class AppConfig {
//we will make beans here
@Bean
public Book getBook()
{
    return new Book();
}
@Bean
public Car getCar()
{
    return new Car();
}

}
