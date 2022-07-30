package com.Basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet {

PrintWriter out;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("Init method inside IncludeServlet");
	}
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		out=resp.getWriter();
		out.println("<h1> Welcome Include Servlet"+ "</h1>");
		RequestDispatcher rdheader=req.getRequestDispatcher("/header");
		rdheader.include(req, resp);
		  RequestDispatcher rdfooter=req.getRequestDispatcher("/footer");
		  rdfooter.include(req, resp);
		
	}
	
}
