package com.ann.app.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ann.app.model.entity.Job;

public class JobBean implements JobBeanI, Serializable{
    
    public String jobsAvailable(){

        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job("ICT", null, null));
        jobs.add(new Job("Test Analyst","Nairobi, Kenya","30 Oct 2023"));
        jobs.add(new Job("DevOps Engineer", "Kigali, Rwanda", "1 Nov 2023"));
        jobs.add(new Job("Human Resource", null, null));
        jobs.add(new Job("Director, Administrative services", "Nairobi,Kenya", "23 Oct 2023"));
        jobs.add(new Job("Human Resource Assistant", "Eldoret", "20 Oct 2023"));
        jobs.add(new Job("Community Development", null, null));
        jobs.add(new Job("Program Coordinator, inclusive communities", "Nairobi, Kenya", "20 Oct 2023"));
        jobs.add(new Job("Program Coordinator, Refugee communities", "Lodwar, Kenya", "4 Nov 2023"));

        StringBuilder trBuilder = new StringBuilder();

        trBuilder.append("<table><tr><th>Title</th><th>Location</th><th>Date Posted</th></tr>");

        for (Job job : jobs)
            trBuilder.append(job.tableRow());

        trBuilder.append("</table>");

        return trBuilder.toString();

    }

    public Job addOrUpdateJob(Job job) throws Exception{

        return null;
    }

    public void deleteJob(Job job) {

    }

   
}
