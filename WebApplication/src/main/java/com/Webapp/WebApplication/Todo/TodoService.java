package com.Webapp.WebApplication.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "Bao", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "Bao", "Learn how to do a back flip", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "Bao", "Learn to be cool", LocalDate.now().plusYears(3), false));
    }
    
    public List<Todo> findByUsername(String name){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate date, boolean isDone){
        Todo todo = new Todo(++todosCount, username, description, date, isDone);
        todos.add(todo);
    }

}
