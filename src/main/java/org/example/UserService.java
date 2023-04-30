package org.example;

import javax.xml.namespace.QName;

public class UserService {
    private final UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public boolean checkUserExist(User user){
       return dao.getUserByName(user.getName())!=null;
    }
}
