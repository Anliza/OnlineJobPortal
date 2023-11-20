package com.ann.app.model;

import java.io.Serializable;

import com.ann.database.helper.DbColumn;
import com.ann.database.helper.DbTable;

@DbTable(name = "users")
public class User implements Serializable{

    @DbColumn(name = "id", definition = "int")
    private Long id;

    @DbColumn(name = "username")
    private String username;

    @DbColumn(name = "password")
    private String password;

    private String confirmPassword;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
}
