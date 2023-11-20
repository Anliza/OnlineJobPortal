package com.ann.app.model;

import java.io.Serializable;

import com.ann.app.view.helper.HtmlForm;
import com.ann.app.view.helper.HtmlFormField;
import com.ann.app.view.helper.HtmlTable;
import com.ann.app.view.helper.TableColHeader;
import com.ann.database.helper.DbColumn;
import com.ann.database.helper.DbTable;

@DbTable(name = "job")
@HtmlTable(addUrl = "./job?action=add")
@HtmlForm(label ="Job",url = "./job")
public class Job implements Serializable{
    
    @DbColumn(name = "job-title")
    @TableColHeader(header = "Job Title")
    @HtmlFormField(label = "Job Title")
    private String title;

    @DbColumn(name = "location")
    @TableColHeader(header = "Location")
    @HtmlFormField(label = "Location")
    private String location;

    @DbColumn(name = "date-posted")
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
