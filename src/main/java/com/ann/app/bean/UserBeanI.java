package com.ann.app.bean;

import com.ann.app.model.User;

public interface UserBeanI {
    
    boolean register(User user);

    boolean delete(User user);
}
