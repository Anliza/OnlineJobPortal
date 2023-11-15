package com.ann.app.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ann.app.bean.JobBean;
import com.ann.app.bean.JobBeanI;

@WebServlet("/home")

public class Home extends BaseAction{

    JobBeanI jobBean = new JobBean();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        renderPage(req, resp, 0,
        "<center><h2 style=\"color: #E0E5E9;\">Available Jobs</h2></center>\n"
        + jobBean.jobsAvailable());
            
    }
    
}
