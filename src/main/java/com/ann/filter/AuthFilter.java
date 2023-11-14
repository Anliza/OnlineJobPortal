package com.ann.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

@WebFilter (urlPatterns = "/*")
public class AuthFilter implements Filter {

    @Override 
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            HttpSession httpSession = httpRequest.getSession();
            
            String servletPath = httpRequest.getServletPath();
            System.out.print("servlet path: " +servletPath);
            System.out.println("context path: " +httpRequest.getContextPath());
            System.out.println("context URI: "+ httpRequest.getRequestURI());

            if(httpSession.isNew()){
                httpSession.invalidate();

                if (servletPath.equals("/login") || servletPath.equals("/index.html"))
                    chain.doFilter(request,response);
                    else{
                        httpResponse.sendRedirect(httpRequest.getContextPath() + "/");
                        /* make sure the whole writer is cleared */
                        response.getWriter().flush(); 
                    }
            }else {
                if (StringUtils.isNotBlank((String) httpSession.getAttribute("loggedInId")))
                chain.doFilter(request, response);
                else{
                    httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
                    response.getWriter().flush();
                }
            }
        }   

    @Override
    public void init(FilterConfig config)throws ServletException{
        Filter.super.init(config);
        } 

    @Override
    public void destroy(){
        Filter.super.destroy();
        } 
}
