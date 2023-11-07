package com.ann.app.view.css;

import java.io.Serializable;

public class LoginCss implements Serializable{
    
    private String lStyle = "    <style>\n" + //
    "        Body {\n" + //
    "            font-family: Calibri, Helvetica, sans-serif;\n" + //
    "            background-color: #096E77;\n" + //
    "        }\n" + //
    "\n" + //
    "        button {\n" + //
    "            background-color: #9F496E;\n" + //
    "            width: 100px;\n" + //
    "            color: #F4F2F3;\n" + //
    "            padding: 5px;\n" + //
    "            border: none;\n" + //
    "            cursor: pointer;\n" + //
    "        }\n" + //
    "\n" + //
    "        input[type=text],\n" + //
    "        input[type=password] {\n" + //
    "            width: 100%;\n" + //
    "            margin: 8px 0;\n" + //
    "            padding: 12px 20px;\n" + //
    "            display: inline-block;\n" + //
    "            border: 2px #F4F2F3;\n" + //
    "            box-sizing: border-box;\n" + //
    "        }\n" + //
    "\n" + //
    "        button:hover {\n" + //
    "            opacity: 0.7;\n" + //
    "        }\n" + //
    "\n" + //
    "        .container {\n" + //
    "            padding: 20px;\n" + //
    "            background-color: #E0E5E9;\n" + //
    "            width: 500px;\n" + //
    "            margin: 0 auto;\n" + //
    "            color: #9F496E;\n" + //
    "        }\n" + //
    "    </style>\n" ;

    public String getlStyle() {
        return lStyle;
    }

    public void setlStyle(String lStyle) {
        this.lStyle = lStyle;
    }
}
