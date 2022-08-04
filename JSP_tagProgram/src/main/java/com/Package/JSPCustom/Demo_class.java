package com.Package.JSPCustom;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo_class extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		JspWriter out =pageContext.getOut();
		try {
			out.println("<table>");
			out.println("</table>");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Tag.EVAL_PAGE;
	}
}
