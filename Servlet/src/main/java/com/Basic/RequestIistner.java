package com.Basic;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class RequestIistner  implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent event) {
		// TODO Auto-generated method stub
		System.out.println("add attribute "+ event.getName());
		System.out.println("add attribute "+ event.getValue());
		System.out.println("add attribute "+ event.getSource());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		
	}

}
