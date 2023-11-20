package com.ann.app.bean;

import java.sql.SQLException;

import com.ann.app.model.User;

public interface UserBeanI {
    
    boolean register(User user)throws SQLException;

    boolean delete(User user);
}
