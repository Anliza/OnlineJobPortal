package com.ann.app.view.html;


import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class HtmlComponent implements Serializable {
 
    public static String table(List<?> models){
        if (models == null || models.isEmpty())
            return StringUtils.EMPTY;

        Field [] fields = models.get(0).getClass().getDeclaredFields();

        StringBuilder trBuilder = new StringBuilder();
        trBuilder.append("<table><tr>");

        for(Field field : fields)
        trBuilder.append("<th> "+ field.getName()+"</th>");

        trBuilder.append("</tr>");

        for (Object model : models){

        trBuilder.append("<tr>");

        for(Field field : fields){
            try {
                trBuilder.append("<td>").append(field.get(model)).append("</td>");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    
        trBuilder.append("<tr>");
        }
          
        trBuilder.append("</table>");
        return trBuilder.toString();

    }

    public static String form(Class <?> model){
        String htmlForm = "<center\n>" +"<form\n>" +
        "<br/ style=\"color: #E0E5E9;\">Add Job<br/> <form action=\"./job\" method=\"post\">";

        Field [] fields =model.getDeclaredFields();

        for (Field field : fields){
            if (!field.isAnnotationPresent(HtmlFormField.class))

            String fieldName =field.getName();
            htmlForm +=  "  <label for=\"" + fieldName + "\" style=\"color: #E0E5E9;\">" + fieldName + ":</label><br>";
            htmlForm += "  <input type=\"text\" id=\"" + fieldName + "\" name=\"" + fieldName + "\" ><br>" ;
        
        }

        htmlForm += "  <input type=\"submit\" value=\"Submit\">" ;
        htmlForm += "</form><br/>\n" ;
        htmlForm += "</center>\n";
        
        return htmlForm;
    
    }
}