package com.ann.app.bean;

import com.ann.app.model.entity.Job;

public interface JobBeanI {
    
    String jobsAvailable();

    Job addOrUpdateJob(Job job);

    void deleteJob(Job job);
}
