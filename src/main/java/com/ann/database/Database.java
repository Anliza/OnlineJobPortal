package com.ann.database;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ann.app.model.entity.Job;
import com.ann.app.model.entity.User;

public class Database implements Serializable{


    private String databaseCreateAt;

    private List<User> users = new ArrayList<>();

    private List<Job> jobs = new ArrayList<>();

    private static Database dbInstance;

     private Database(){}

    public static Database getDbInstance(){
        if (dbInstance == null) {
            dbInstance = new Database();
            dbInstance.databaseCreateAt = DateFormat.getDateTimeInstance().format(new Date());
            System.out.println("Database created at " + dbInstance.getDatabaseCreateAt());
        }

        return dbInstance;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


    public String getDatabaseCreateAt() {
        return databaseCreateAt;
    }

    public void setDatabaseCreateAt(String databaseCreateAt) {
        this.databaseCreateAt = databaseCreateAt;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public static void setDbInstance(Database dbInstance) {
        Database.dbInstance = dbInstance;
    }
    
}
