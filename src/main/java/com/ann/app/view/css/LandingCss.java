package com.ann.app.view.css;

import java.io.Serializable;

public class LandingCss implements Serializable{
    
    private String LandingStyle = "<style>" + 
            "* {" + 
            "  box-sizing: border-box;" + 
            "}" + 
            "Body { " + 
            "  font-family: Calibri, Helvetica, sans-serif;  " + 
            "  background-color: #096E77; " + 
            "}  " + 
            
            "header {" + 
            "  background-color: #096E77;" + 
            "  padding: 30px;" + 
            "  text-align: center;" + 
            "  font-size: 35px;" + 
            "  color: #F4F2F3;" + 
            "}" + 
            
            "nav {" + 
            "  float: left;" + 
            "  width: 30%;" + 
            "  height: 400px; "+ 
            "  background:  #b56789;" + 
            "  padding: 20px;" + 
            "  color: #F4F2F3;" + 
            "  text-align: center;" + 
            "}" + 
            
            "nav ul {" + 
            "  list-style-type: none;" + 
            "  padding: 0;" + 
            "}" + 
            
            "article {" + 
            "  float: left;" + 
            "  padding: 0px;" + 
            "  width: 70%;" + 
            "  background-color: #E0E5E9;" + 
            "  height: 400px; " + 
            "}" + 
            
            "section::after {" + 
            "  content: \"\";" + 
            "  display: table;" + 
            "  clear: both;" + 
            "}" + 
            
            "footer {" + 
            "  background-color:#096E77;" + 
            "  padding: 10px;" + 
            "  text-align: center;" +
            "  color: #F4F2F3;" + 
            "  font-size: 15px;" + 
            "}" + 
            
            "@media (max-width: 600px) {" + 
            "  nav, article {" + 
            "    width: 100%;" + 
            "    height: auto;" + 
            "  }" + 
            "}" + 
            "</style>";

    public String getLandingStyle() {
        return LandingStyle;
    }

    public void setLandingStyle(String landingStyle) {
        LandingStyle = landingStyle;
    }
    
}
