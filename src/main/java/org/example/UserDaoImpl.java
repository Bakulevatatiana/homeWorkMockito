package org.example;

import java.util.*;

public class UserDaoImpl implements UserDao {
    private final List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("Oleg", 45, "Oleg@mail.ru")
        );


    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public List<User> fineAllUsers() {
        return users;
    }


}

