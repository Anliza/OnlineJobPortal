package com.ann.app.view.css;

import java.io.Serializable;

public class LoginRegisterCss implements Serializable{
    
    private String lStyle = "    <style>" + 
            "        Body {" + 
            "            font-family: Calibri, Helvetica, sans-serif;" + 
            "            background-color: #096E77;" + 
            "        }" +

            "        button {" + 
            "            background-color: #9F496E;" + 
            "            width: 100px;" + 
            "            color: #F4F2F3;" + 
            "            padding: 5px;" + 
            "            border: none;" + 
            "            cursor: pointer;" + 
            "        }" + 
            
            "        input[type=text]," + 
            "        input[type=password] {" + 
            "            width: 100%;" + 
            "            margin: 8px 0;" + 
            "            padding: 12px 20px;" + 
            "            display: inline-block;" + 
            "            border: 2px #F4F2F3;" + 
            "            box-sizing: border-box;" + 
            "        }" + 
            
            "        button:hover {" + 
            "            opacity: 0.7;" + 
            "        }" + 
            
            "        .container {" + 
            "            padding: 20px;" + 
            "            background-color: #E0E5E9;" + 
            "            width: 500px;" + 
            "            margin: 0 auto;" + 
            "            color: #9F496E;" + 
            "        }" + 
            "    </style>";

    public String getlStyle() {
        return lStyle;
    }

    public void setlStyle(String lStyle) {
        this.lStyle = lStyle;
    }
}
