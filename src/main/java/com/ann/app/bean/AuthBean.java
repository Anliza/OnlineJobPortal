package com.ann.app.bean;

import java.io.Serializable;

import com.ann.app.model.entity.User;
import com.ann.database.Database;

public class AuthBean implements AuthBeanI, Serializable {

    Database database = Database.getDbInstance();

    public User authenticate(User loginUser){
        User userDetails = null;
        
        System.out.println("what time was this database created: " + database.getDatabaseCreateAt());

        for (User user : database.getUsers()) {
            if (loginUser.getUsername().equals(user.getUsername()) && loginUser.getPassword().equals(user.getPassword())) {
                userDetails = user;

                break;

            }
        } 
        return userDetails;  
    }
    
}
