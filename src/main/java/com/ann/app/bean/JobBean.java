package com.ann.app.bean;

import java.io.Serializable;

import com.ann.app.model.entity.Job;
import com.ann.app.view.html.HtmlComponent;
import com.ann.database.Database;

public class JobBean implements JobBeanI, Serializable{
    
    public String jobsAvailable(){

        return HtmlComponent.table(Database.getDbInstance().getJobs());

    }

    public Job addOrUpdateJob(Job job) {
        Database database =Database.getDbInstance();
        database.getJobs().add(job);
        return job;
    }

    public void deleteJob(Job job) {

    }

   
}
