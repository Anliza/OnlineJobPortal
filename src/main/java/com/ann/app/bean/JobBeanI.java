package com.ann.app.bean;

import com.ann.app.model.Job;

public interface JobBeanI {
    
    String jobsAvailable();

    Job addOrUpdateJob(Job job);

    void deleteJob(Job job);
}
