package com.ann.event;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.ann.app.model.Job;
import com.ann.app.model.User;
import com.ann.database.Database;
import com.ann.database.MysqlDatabase;
import com.ann.database.helper.DbColumn;
import com.ann.database.helper.DbTable;

@WebListener
public class AppInit implements ServletContextListener{
    
     @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("*************** Initializing database *************");

        try {
            Connection connection = MysqlDatabase.getInstance().getConnection();

            List<Class<?>> entities = new ArrayList<>();
            entities.add(User.class);
            entities.add(Job.class);
           

            for (Class<?> clazz : entities) {
                if (!clazz.isAnnotationPresent(DbTable.class))
                    continue;

                DbTable dbTable = clazz.getAnnotation(DbTable.class);

                StringBuilder sqlBuilder = new StringBuilder();

                sqlBuilder.append("create table if not exists ").append(dbTable.name()).append("(");
                for (Field field : clazz.getDeclaredFields()) {
                    if (!field.isAnnotationPresent(DbColumn.class))
                        continue;

                    DbColumn dbTableColumn = field.getAnnotation(DbColumn.class);

                    sqlBuilder.append(dbTableColumn.name()).append(" ").append(dbTableColumn.definition()).append(",");
                }

                sqlBuilder.append(")");

                connection.prepareStatement(sqlBuilder.toString().replace(",)", ")")).executeUpdate();

            }



            //auto create databse -- if does not exist
            //auto create create tables; if does not exist

            //create custom annotation.. use java reflection to create table....


        } catch (SQLException ex) {
            System.out.println(ex);
        }

       /* Database database = Database.getDbInstance();
        database.getUsers().add(new User(0L, "Annliza", "12345"));
        database.getUsers().add(new User(0L, "Ann.Munyi", "54321"));
        database.getUsers().add(new User(0L, "jane.doe", "00000"));

        database.getJobs().add(new Job("ICT", "NAIROBI", "2 Nov 2023"));
        database.getJobs().add(new Job("HUMAN RESOURCE", "KISUMU", "30 Oct 2023"));
        database.getJobs().add(new Job("COMMUNITY DEVELOPMENT", "ELDORET", "20 Oct 2023")); */ 
        

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        try {
            MysqlDatabase database = MysqlDatabase.getInstance();

            if (database.getConnection() != null){
                database.getConnection().close();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
}
