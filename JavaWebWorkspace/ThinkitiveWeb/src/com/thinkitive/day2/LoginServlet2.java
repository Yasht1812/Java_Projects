package com.thinkitive.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet2() {
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
			RequestDispatcher d = request.getRequestDispatcher("index2.jsp");
			request.setAttribute("message", "<p class='btn-success'>Success</p>");
			d.forward(request, response);
		}
		else {
			RequestDispatcher d = request.getRequestDispatcher("index2.jsp");
			request.setAttribute("message", "<p class='btn-danger'>Invalid</p>");
			d.forward(request, response);
		}
	}

}
