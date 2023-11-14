package com.ann.app.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ann.app.bean.JobBean;
import com.ann.app.bean.JobBeanI;
import com.ann.app.model.entity.Job;

@WebServlet("/job")
public class JobAction extends HttpServlet{

    private JobBeanI jobBeanEn = new JobBean();
    
      public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

            jobBeanEn.addOrUpdateJob(new Job(req.getParameter("title"), req.getParameter("location"), 
                req.getParameter("date posted")));
            

            resp.sendRedirect("./home");

    }
}
