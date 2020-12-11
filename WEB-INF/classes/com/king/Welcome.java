package com.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
		@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        //out.println("hello world from welcome servlet!");
        
        String sname, rollno, mark;
        sname =   req.getParameter("sname");
        rollno = req.getParameter("rollno");
        mark =   req.getParameter("mark");
        
        out.println("Following information submitted");
        out.println("Name: " + sname);
        out.println("Rollno: " + rollno);
        out.println("Mark: " + mark);
    }
}
