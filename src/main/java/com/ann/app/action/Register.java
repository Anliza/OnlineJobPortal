package com.ann.app.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ann.app.bean.UserBean;
import com.ann.app.bean.UserBeanI;
import com.ann.app.model.User;
import com.ann.app.view.helper.RegisterPage;



@WebServlet("/register")
public class Register extends BaseAction{
    UserBeanI userBean =new UserBean();
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        new RegisterPage().renderHtml(req, resp);
    }

     public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User registerUser = new User();
        serializeForm(registerUser, req.getParameterMap());

        userBean.register(registerUser);

        resp.sendRedirect("./login");
    }
}
