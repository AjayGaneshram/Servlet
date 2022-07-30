package com.Basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Doget method in second servlet");
		PrintWriter out =resp.getWriter();
		out.println("<h1> welcome to servlet "+new Date()+"</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("/third");
		  rd.forward(req, resp);
		  
	}
}
