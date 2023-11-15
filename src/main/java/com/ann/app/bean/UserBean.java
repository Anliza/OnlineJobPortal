package com.ann.app.bean;

import java.io.Serializable;

import com.ann.app.model.User;
import com.ann.database.Database;

public class UserBean implements UserBeanI, Serializable {

    Database database = Database.getDbInstance();

    @Override
    public boolean register(User user) {
        if (user.getPassword().equals(user.getConfirmPassword())){
            database.getUsers().add(new User(100L, user.getUsername(), user.getPassword()));
            
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(User user) {
        return true;
    }
    
}
