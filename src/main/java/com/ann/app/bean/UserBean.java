package com.ann.app.bean;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

import com.ann.app.model.User;
import com.ann.database.MysqlDatabase;

public class UserBean implements UserBeanI, Serializable {

    @Override
    public boolean register(User user) throws SQLException{
        if (user.getPassword().equals(user.getConfirmPassword())){
            

            PreparedStatement sqlStmt = MysqlDatabase.getInstance().getConnection()
                .prepareStatement("insert into users(id,username,password) values(?,?,?)");

            sqlStmt.setInt(1, ThreadLocalRandom.current().nextInt(1, 1000));
            sqlStmt.setString(2, user.getUsername());
            sqlStmt.setString(3, user.getPassword());

            sqlStmt.executeUpdate();
            
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(User user) {
        return true;
    }
    
}
