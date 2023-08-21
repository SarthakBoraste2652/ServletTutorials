package com.sarthakab;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		Cookie ck[] = req.getCookies();
		int k=0;
		for(Cookie element: ck)
		{
			if(element.getName().equals("k"))
				k= Integer.parseInt(element.getValue());
		}
		
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("The square is :"+k);
		
	}

}
