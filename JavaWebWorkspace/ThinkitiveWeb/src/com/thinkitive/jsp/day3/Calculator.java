package com.thinkitive.jsp.day3;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Calculator extends TagSupport{
private Integer a; 
private Integer b ;
public Integer getA() {
	return a;
}
public void setA(Integer a) {
	this.a = a;
}
public Integer getB() {
	return b;
}
public void setB(Integer b) {
	this.b = b;
} 
public int doStart() throws JspException{
	JspWriter out = pageContext.getOut();
	int add = a+b;
	int sub = a-b;
	int mul= a*b;
	int div = a/b;
	try {
		out.println("The addition of two numbers: "+add);
		out.println("The subtraction of two numbers: "+sub);
		out.println("The multiplication of two numbers: "+mul);
		out.println("The division of two numbers: "+div);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return super.doStartTag();
}
}
