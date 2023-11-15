package com.ann.app.bean;

import com.ann.app.model.User;

public interface AuthBeanI {
    User authenticate(User loginUser);
}
