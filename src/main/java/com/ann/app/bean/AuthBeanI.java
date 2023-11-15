package com.ann.app.bean;

import com.ann.app.model.entity.User;

public interface AuthBeanI {
    User authenticate(User loginUser);
}
