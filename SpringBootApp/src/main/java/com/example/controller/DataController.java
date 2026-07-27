package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    List<String> list=new ArrayList<>();
    
    public DataController()
    {
        list.add("Upasana");
        list.add("Virat");
        list.add("Hardik");
        list.add("Robin");
    }
    //@RequestMapping("/show")
    @GetMapping("/show")
    public List<String> show() {
        return list;
    }
    @PostMapping("/add")
    public void add() {
        list.add("Navneet");
    }
    @PutMapping("/update")
    public void update() {
        list.set(3, "Giri");
    }

    @DeleteMapping("/delete")
    public void delete() {
        list.remove(2);

}}
