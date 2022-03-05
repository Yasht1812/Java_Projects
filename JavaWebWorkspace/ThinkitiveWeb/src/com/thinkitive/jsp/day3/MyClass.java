package com.thinkitive.jsp.day3;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;



public class MyClass extends TagSupport {
	//private String message;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
public int doStartTag() throws JspException{
	JspWriter out = pageContext.getOut();
	int ans=1;
	try {
		
		for (int i = 1; i <= Integer.parseInt(message); i++) {

			ans = ans * i;
		}
		

		out.println("the factorial is:"+ans);
	} catch (ArithmeticException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return super.doStartTag();
}
}
