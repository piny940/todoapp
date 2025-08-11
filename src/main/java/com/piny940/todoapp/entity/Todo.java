package com.piny940.todoapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public final class Todo {
    @Id
    private long id;
    private String title;
    private boolean done;

    public Todo() {}
    public Todo(long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public long getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public boolean isDone() {
        return this.done;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
}
