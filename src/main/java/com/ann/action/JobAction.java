package com.ann.action;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.ann.app.model.entity.Job;
import com.ann.database.Database;

@WebServlet("/job")
public class JobAction extends HttpServlet{
    
      public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();

        if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId"))) {

            Database database = Database.getDbInstance();

            database.getJobs().add(new Job(req.getParameter("title"), req.getParameter("location"), 
                req.getParameter("date posted")));

            resp.sendRedirect("./home");

        } else
            resp.sendRedirect("./");

    }
}
