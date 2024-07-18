package com.Webapp.WebApplication.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    public void deleteById(int id) {
        // Todo.getID() == id
        // todo -> todo.getId() == id
        // For ever bean do get ID and look for ==
        Predicate<? super Todo> Predicate 
            = todo -> todo.getId() == id;
        todos.removeIf(Predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> Predicate 
            = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(Predicate).findFirst().get();
        return todo;
    }

}
