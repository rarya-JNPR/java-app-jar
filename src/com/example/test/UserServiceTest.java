package com.example.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserServiceTest {

    @Test
    public void testGetUserInfo() {
        UserService userService = new UserService();
        String result = userService.getUserInfo("admin");
        assertEquals("Admin User: Full access.", result);
    }
}
