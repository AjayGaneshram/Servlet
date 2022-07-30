package com.Basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Doget method in third servlet");
		PrintWriter out =resp.getWriter();
		out.println("<h1> welcome to third servlet "+new Date()+"</h1>");
		String data=(String) req.getAttribute("oneKey");
		out.println("<h1>"+data+"</h1>");
		
	}
}
