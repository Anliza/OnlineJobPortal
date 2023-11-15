package com.ann.app.model.entity;

import java.io.Serializable;

import com.ann.app.view.html.HtmlForm;
import com.ann.app.view.html.HtmlFormField;
@HtmlForm(label ="Job",url = "./job")
public class Job implements Serializable{

    @HtmlFormField(name = "Job Title")
    private String title;

    @HtmlFormField(name = "Location")
    private String location;

    @HtmlFormField(name = "Date Posted")
    private String datePosted;
    
    public Job() {
    }
    public Job(String title, String location, String datePosted) {
        this.title = title;
        this.location = location;
        this.datePosted = datePosted;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDatePosted() {
        return datePosted;
    }
    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }
}
