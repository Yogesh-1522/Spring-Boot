package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class TodoController {
    private static List<Todo> todos;

     public TodoController(){
         todos= new ArrayList<>();
         todos.add(new Todo(1,false,10,"yogesh"));
         todos.get(1);
     }
     @GetMapping("/todos")
}
