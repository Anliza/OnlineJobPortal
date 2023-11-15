package com.ann.app.action;
import java.io.IOException;
// Anything that needs to be reused in all action classes can be implemented in this class
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

public class BaseAction extends HttpServlet {

    public void serializeForm(Object bean, Map<String, ? extends Object> requestMap){
        try {
            BeanUtils.populate(bean, requestMap);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }// implements the bean utils to serialize form parameters to an object
    

    public void renderPage(HttpServletRequest request, HttpServletResponse response, int activeMenu, String content)
            throws ServletException, IOException {
        request.setAttribute("activeMenu", activeMenu);
        request.setAttribute("content", content);
        RequestDispatcher dispatcher = request.getRequestDispatcher("./app/index.jsp");
        dispatcher.forward(request, response);
    }
}
