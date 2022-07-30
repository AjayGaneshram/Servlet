package com.Basic;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class listnerImpl implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Context destroyed");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Context initial");
		
	}

}
