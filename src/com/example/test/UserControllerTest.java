package com.example.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserControllerTest {

    @Test
    public void testGetUserInfo() {
        UserController userController = new UserController(new UserService());
        String result = userController.getUser("admin");
        assertEquals("Admin User: Full access.", result);
    }
}
