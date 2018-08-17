package com.codegym.controller;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> user;
    static{
        user = new ArrayList<>();
        User u1 = new User();
        u1.setAge(16);
        u1.setName("John");
        u1.setAcount("john");
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123456");
        user.add(u1);

        User u2 = new User();
        u2.setAge(20);
        u2.setName("Mary");
        u2.setEmail("mary@codegym.vn");
        u2.setAcount("mary");
        u2.setPassword("123456");
        user.add(u2);
    }
    public static User checkLogin(Login login) {
        for (User u : user) {
            if (u.getAcount().equals(login.getAcount())&& u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
