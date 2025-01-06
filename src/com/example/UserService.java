package com.example.app;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserInfo(String username) {
        // Mocking a database call
        if (username.equals("admin")) {
            return "Admin User: Full access.";
        }
        return "Standard User: Limited access.";
    }
}
