package com.sarthakab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		
		out.println("Hi "+str);
		
		String mob = ctx.getInitParameter("mobile");
		out.println("You are using "+mob);
	}
}
