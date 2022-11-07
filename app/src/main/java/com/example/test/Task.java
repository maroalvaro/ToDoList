package com.example.test;

import java.util.Date;
import java.util.UUID;


public class Task {
    private UUID id = UUID.randomUUID();
    private Date date = new Date();
    private boolean done = false;

    private String name;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

}
