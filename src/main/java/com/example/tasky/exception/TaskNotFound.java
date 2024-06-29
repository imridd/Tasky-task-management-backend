package com.example.tasky.exception;
public class TaskNotFound extends RuntimeException {
    public TaskNotFound(String message) {
        super(message);
    }
}