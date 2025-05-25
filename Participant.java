package com.example.localloop;

public class Participant extends User {
    public Participant(String username, String password) {
        super(username, password, "admin");
    }
}