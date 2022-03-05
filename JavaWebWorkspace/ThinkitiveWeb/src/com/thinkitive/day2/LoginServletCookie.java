package com.thinkitive.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServletCookie
 */
@WebServlet("/LoginServletCookie")
public class LoginServletCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	String user = request.getParameter("txtusername");
	String pass = request.getParameter("txtpassword");
	if(user.equals("admin") && pass.equals("admin")) {
			/*
			 * Cookie ck = new Cookie("sessionid","123456"); response.addCookie(ck);
			 * RequestDispatcher d = request.getRequestDispatcher("ProfileServletCookie");
			 * d.forward(request, response);
			 */
		//response.sendRedirect("ProfileServletCookie?sessionid=0987654321");
		response.sendRedirect("ImportantPage?sessionid=0987654321");
	}
	else {
		out.println("Invalid user or pass");
	}
	}

}
