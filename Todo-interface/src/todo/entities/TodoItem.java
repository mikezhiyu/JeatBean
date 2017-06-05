/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ipd
 */
public class TodoItem implements Serializable
{
private static final long serialVersionUID = 1L;
private static int count;

private int id;
private String task;
private Date dueDate;
private boolean isDone;

    public TodoItem(String task, Date dueDate, boolean isDone) {
        id = ++count;
        this.task = task;
        this.dueDate = dueDate;
        this.isDone = isDone;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
        if(task.isEmpty())
        { 
          System.out.println("the task can not be empty");
        }

    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }
 
}
