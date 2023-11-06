package com.ann.event;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.ann.app.model.entity.Job;
import com.ann.app.model.entity.User;
import com.ann.database.Database;

@WebListener
public class AppInit implements ServletContextListener{
    
     @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("*************** Initializing database *************");

        Database database = Database.getDbInstance();
        database.getUsers().add(new User(0L, "john.snow@test.com", "12345"));
        database.getUsers().add(new User(0L, "john.doe@test.com", "54321"));
        database.getUsers().add(new User(0L, "jane.doe@test.com", "00000"));

        database.getJobs().add(new Job("ICT", "NAIROBI", "2 Nov 2023"));
        database.getJobs().add(new Job("HUMAN RESOURCE", "KISUMU", "30 Oct 2023"));
        database.getJobs().add(new Job("COMMUNITY DEVELOPMENT", "ELDORET", "20 Oct 2023"));
        

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Application is undeployed or destroyed");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
