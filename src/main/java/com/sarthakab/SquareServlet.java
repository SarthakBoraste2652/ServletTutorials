package com.sarthakab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
//		out.println("Welcome to squareroot..!!");
//		int k = (int) req.getAttribute("k");
		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k;
		out.println("The square is :"+k);
		
	}

}