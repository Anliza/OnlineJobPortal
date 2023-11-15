package com.ann.app.bean;

import com.ann.app.model.entity.User;

public interface UserBeanI {
    
    boolean register(User user);

    boolean delete(User user);
}
