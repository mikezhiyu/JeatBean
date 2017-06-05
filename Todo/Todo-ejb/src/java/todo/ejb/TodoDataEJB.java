/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.ejb;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import static javax.ejb.ConcurrencyManagementType.CONTAINER;
import javax.ejb.Lock;
import static javax.ejb.LockType.READ;
import static javax.ejb.LockType.WRITE;
import javax.ejb.Singleton;
import todo.entities.TodoItem;

@ConcurrencyManagement(CONTAINER)
@AccessTimeout(value = 120000)
@Singleton
public class TodoDataEJB implements TodoDataEJBRemote {

    private ArrayList<TodoItem> todoList;

    @PostConstruct
    public void initialze() {
        System.out.println(" TodoDateEJB.initialze()");
        todoList = new ArrayList<>();

    }

// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    @Lock(READ)
    public TodoItem[] getAllTodoItems() {

        System.out.println("TodoDateEJB.getAllTodoItems()");
        return todoList.toArray(new TodoItem[0]);
    }

    @Override
    @Lock(WRITE)
    public void addTodoItem(TodoItem item) {
        System.out.println("TodoDateEJB.addTodoItem()");
        todoList.add(item);
    }
}
