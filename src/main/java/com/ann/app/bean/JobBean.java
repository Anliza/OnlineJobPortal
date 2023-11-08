package com.ann.app.bean;

import java.io.Serializable;
import java.util.List;

import com.ann.app.model.entity.Job;
import com.ann.database.Database;

public class JobBean implements JobBeanI, Serializable{
    
    public String jobsAvailable(){

        List<Job> jobs = Database.getDbInstance().getJobs();
        StringBuilder trBuilder = new StringBuilder();

        trBuilder.append("<table><tr><th>Title</th><th>Location</th><th>Date Posted</th></tr>");

        for (Job job : jobs)
            trBuilder.append(job.tableRow());
        trBuilder.append("</table>");

        return trBuilder.toString();

    }

    public Job addOrUpdateJob(Job job) {
        Database database =Database.getDbInstance();
        database.getJobs().add(job);
        return job;
    }

    public void deleteJob(Job job) {

    }

   
}
