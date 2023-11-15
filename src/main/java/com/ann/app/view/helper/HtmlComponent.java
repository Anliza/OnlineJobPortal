package com.ann.app.view.helper;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

public class HtmlComponent implements Serializable {

    public static String table(List<? extends Object> models){

        if (models == null || models.isEmpty())
            return StringUtils.EMPTY;

        Field [] fields = models.get(0).getClass().getDeclaredFields();

        StringBuilder trBuilder = new StringBuilder();
        trBuilder.append("<table><tr>");

        for (Field field : fields) {
            if (!field.isAnnotationPresent(TableColHeader.class))
                continue;

            trBuilder.append("<th>" + field.getAnnotation(TableColHeader.class).header() + "</th>");
        }

        trBuilder.append("</tr>");

        for (Object model : models){

            trBuilder.append("<tr>");
            for (Field field : fields) {
                if (!field.isAnnotationPresent(TableColHeader.class))
                    continue;

                try {
                    field.setAccessible(true);
                    trBuilder.append("<td>").append(field.get(model)).append("</td>");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            trBuilder.append("<tr>");

        }

        trBuilder.append("</table>");

        return trBuilder.toString();

    }

    public static String form(Class<?> model){

        HtmlForm aHtmlForm = null;
        if (model.isAnnotationPresent(HtmlForm.class))
            aHtmlForm = model.getAnnotation(HtmlForm.class);

        if (aHtmlForm == null)
            return StringUtils.EMPTY;

       String htmlForm =  "<center\n>" + "<h2>" +  aHtmlForm.label() + "</h2>" +
        "<br/ style=\"color: #E0E5E9;\">Add " + aHtmlForm.label() + "<br/><form action=\"" + aHtmlForm.url()
           + "\" method=\"" + aHtmlForm.httpMethod() + "\">";

        Field [] fields = model.getDeclaredFields();

        for (Field field : fields) {
            if (!field.isAnnotationPresent(HtmlFormField.class))
                continue;

            HtmlFormField formField = field.getAnnotation(HtmlFormField.class);

            String fieldName = field.getName();

            htmlForm += "<label for=\""
                    + (StringUtils.isBlank(formField.labelFor())?fieldName : formField.labelFor())
                + "\" style=\"color: #E0E5E9;\">"
                    + (StringUtils.isBlank(formField.label())?fieldName : formField.label()) + ":</label><br>";
            htmlForm += "<input type=\"text\" id=\""
                    + (StringUtils.isBlank(formField.id())?fieldName : formField.id())+ "\" name=\""
                    + (StringUtils.isBlank(formField.name())?fieldName : formField.name()) + "\" ><br>";
        }

        htmlForm += "<input type=\"submit\" value=\"Submit\">";
        htmlForm += "</form><br/>";
        htmlForm += "</center>\n";

        return htmlForm;


    }
}