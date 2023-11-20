package com.ann.database;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDatabase implements Serializable{
   
    
    private static final String URL = "jdbc:mysql://localhost:3306/jobportal";

    private static final String USER = "root";

    private static final String PASSWORD = "Uchend22#";

    private static MysqlDatabase database;

    private Connection connection;

    private MysqlDatabase() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static MysqlDatabase getInstance() throws SQLException{
        if (database == null)
            database = new MysqlDatabase();

        return database;

    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}