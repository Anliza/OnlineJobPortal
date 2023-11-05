package com.ann.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.ann.app.bean.JobBean;
//import com.ann.app.bean.JobBeanFrench;
import com.ann.app.bean.JobBeanI;

@WebServlet("/home")

public class Home extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId"))){

        ServletContext ctx = getServletContext();

        JobBeanI jobBeanEn = new JobBean();
        //JobBeanI jobBeanFr = new JobBeanFrench();

        PrintWriter print = resp.getWriter();

        print.write("<!DOCTYPE html>\n" + //
                "<html>\n" + //
                "<head>\n" + //
                "    <style>\n" + //
                "Body {  \n" + //
                "  font-family: Calibri, Helvetica, sans-serif;  \n" + //
                "  background-color: #096E77; \n" + //
                "} \n" + //
                "\n" + //
                "table {\n" + //
                "  font-family: arial, sans-serif;\n" + //
                "  border-collapse: collapse;\n" + //
                "  width: 80%;\n" + //
                "  background-color:#E0E5E9 ;\n" + //
                "  margin: 0 auto;\n" + //
                "}\n" + //
                "\n" + //
                "td, th {\n" + //
                "  border: 1px solid #dddddd;\n" + //
                "  text-align: left;\n" + //
                "  padding: 8px;\n" + //
                "}\n" + //
                "\n" + //
                "tr:nth-child(even) {\n" + //
                "  background-color: #b1387ecb;\n" + //
                "}\n" + //
                "</style>\n" + //
                "</head>\n" + //
                "<body>\n" + //
                    "Welcome: " + ctx.getAttribute("username") + "<br/>" +
                    ctx.getInitParameter("AppName") + "<br/>" +
                "\n" + //
                "<center><h2 style=\"color: #E0E5E9;\">Available Jobs</h2></center>\n");
            print.write(jobBeanEn.jobsAvailable());
            print.write("\n" +//
                //"Server Info: " + ctx.getServerInfo() + "<br/>" +
                //"Application Deployment Location" + ctx.getRealPath(ctx.getContextPath()) + "<br/>" +
                "\n" +//
                "<center><a href=\"./logout\">Logout</a></center>\n "+ //
                "</body>\n" + //
                "</html>");
    } else
            resp.sendRedirect("./");
    }
    
}
