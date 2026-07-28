package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
     @GetMapping("/show/{id}")
    public String showOne(@PathVariable int id) {
        return list.get(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody String name) {
        list.add(name);
    }
    @PutMapping("/update/{id}")
    public void update(@PathVariable int id,@RequestBody String name) {
        list.set(id,name);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        list.remove(id);

}}
