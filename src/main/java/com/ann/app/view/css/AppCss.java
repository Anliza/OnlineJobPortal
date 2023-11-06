package com.ann.app.view.css;

import java.io.Serializable;

public class AppCss implements Serializable{
    
    private String style = " <style>" + 
    "Body {  " + 
    "  font-family: Calibri, Helvetica, sans-serif;  " + 
    "  background-color: #096E77; " + 
    "} " + 

    ".topnav {" +
    "overflow: hidden;" +
    "background-color: #E0E5E9 ;" +
"}" +

".topnav a {" +
    "float: left;" +
    "color: #096E77;" +
    "text-align: center;" +
    "padding: 14px 16px;" +
    "text-decoration: none;" +
    "font-size: 17px;" +
"}" +

".topnav a:hover {" +
    "background-color: #ddd;" +
    "color: black;" +
"}" +

".topnav a.active {" +
    "background-color: #04AA6D;" +
    "color: white;" +
"}" +
    
    "table {" + 
    "  font-family: arial, sans-serif;" + 
    "  border-collapse: collapse;" + 
    "  width: 80%;" + 
    "  background-color:#E0E5E9 ;" + 
    "  margin: 0 auto;" + 
    "}" + 
    
    "td, th {" + 
    "  border: 1px solid #dddddd;" + 
    "  text-align: left;" + 
    "  padding: 8px;" + 
    "}" + 
    
    "tr:nth-child(even) {" + 
    "  background-color: #b1387e;" + 
    "}" + 
    "</style>";

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

}
