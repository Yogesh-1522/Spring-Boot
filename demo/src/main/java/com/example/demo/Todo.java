package com.example.demo;

public class Todo {
    private int id;
    private boolean completed;
    private String title;
    private int userId;

    public Todo(int id, boolean completed, int userId, String title) {
        this.id = id;
        this.completed = completed;
        this.userId = userId;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", completed=" + completed +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                '}';
    }
}
