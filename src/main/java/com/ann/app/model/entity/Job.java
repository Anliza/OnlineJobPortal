package com.ann.app.model.entity;

import java.io.Serializable;

import com.ann.app.view.html.HtmlForm;
import com.ann.app.view.html.HtmlFormField;
import com.ann.app.view.html.TableColHeader;
@HtmlForm(label ="Job",url = "./job")
public class Job implements Serializable{
    
    @TableColHeader(header = "Job Title")
    @HtmlFormField(label = "Job Title")
    private String title;

    @TableColHeader(header = "Location")
    @HtmlFormField(label = "Location")
    private String location;

    @TableColHeader(header = "Date Posted")
    @HtmlFormField(label = "Today's Date")
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
