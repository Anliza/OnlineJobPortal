package com.ann.app.model;

import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;

public class Job implements Serializable{
    
    private String title;
    private String location;
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

    public String tableRow(){

        StringBuilder trBuilder = new StringBuilder();

        trBuilder.append("<tr>");
        trBuilder.append("<td>").append(StringUtils.trimToEmpty(getTitle())).append("</td>");
        trBuilder.append("<td>").append(StringUtils.trimToEmpty(getLocation())).append("</td>");
        trBuilder.append("<td>").append(StringUtils.trimToEmpty(getDatePosted())).append("</td>");
        /*trBuilder.append("<td>").append(getDatePosted() == null? ""
            : new SimpleDateFormat("dd.MM.yyyy").format(getDatePosted())).append("</td>");*/
        trBuilder.append("<tr>");

        return trBuilder.toString();
    }
}
