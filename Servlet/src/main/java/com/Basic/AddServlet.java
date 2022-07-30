package com.Basic;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	PrintWriter out;
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
		String jdbc=config.getInitParameter("jdbcDriver");
		System.out.println(jdbc);
	}
	
	  @Override 
	  protected void service(HttpServletRequest req, HttpServletResponse
	  resp) throws ServletException, IOException 
	  { 
		  int i=Integer.parseInt(req.getParameter("nam"));
		  int j=Integer.parseInt(req.getParameter("age"));
	  
	  int k=i+j; 
	  out =resp.getWriter();
	  out.println("The result is "+k);
	  Enumeration<String> enumObj=req.getHeaderNames();
	  out.println(req.getHeaderNames());
	  while(enumObj.hasMoreElements())
	  {
		  String name=enumObj.nextElement();
		  Enumeration<String> newObject=req.getHeaders(name);
		  while(newObject.hasMoreElements()) {
			  String value=newObject.nextElement();
			  out.println(name+"   :   "+value);
		  }
		  
	  }
	  
	  HttpSession session=req.getSession(true);
	  session.setAttribute("session", "Value of the session");
	  req.setAttribute("oneKey", "Value for the key");
	  Cookie cookie= new Cookie("cookies_name", URLEncoder.encode("First cookie"));
	  cookie.setMaxAge(200);
	  resp.addCookie(cookie);
	  RequestDispatcher rd=req.getRequestDispatcher("/sec");
	  rd.forward(req, resp);
	  
	  
	  
	  }
	 
	
}
