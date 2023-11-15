package com.ann.app.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.ann.app.bean.AuthBean;
import com.ann.app.bean.AuthBeanI;
import com.ann.app.model.entity.User;
import com.ann.app.view.html.LoginPage;

@WebServlet(urlPatterns = "/login")

public class Login extends BaseAction{
    AuthBeanI authBean = new AuthBean();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        new LoginPage().renderHtml(req, resp);
    }
    

     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        User loginUser  = new User();
        serializeForm(loginUser, req.getParameterMap());

        User userDetails = authBean.authenticate(loginUser);

        if (userDetails != null) {
            HttpSession httpSession = req.getSession(true);

            httpSession.setAttribute("loggedInId", new Date().getTime() + "");
            httpSession.setAttribute("username", loginUser.getUsername());

            resp.sendRedirect("./home");

        }

        PrintWriter print = resp.getWriter();
        print.write("<html><body>Invalid login details <a href=\".\"> Login again </a></body></html>");

 
     }
    
}
