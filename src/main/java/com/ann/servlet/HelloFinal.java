package com.ann.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/eve")

public class HelloFinal extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        PrintWriter print = resp.getWriter();
        print.print("This is the final hello world, can only be accessed using get method!!");

    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        PrintWriter print = resp.getWriter();
        print.print("This is the final hello world, can only be accessed using final post method!!");

    }
}
