package org.example;

import java.util.List;

public interface UserDao {

     User getUserByName(String name);

     List<User> fineAllUsers();
}
