package com.thinkitive.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServletHttp
 */
@WebServlet("/LoginServletHttp")
public class LoginServletHttp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletHttp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("txtusername");
		String pass = request.getParameter("txtpassword");
		if(user.equals("admin") && pass.contentEquals("admin")) {
			HttpSession session = request.getSession();// Open session if exists else create new
			session.setAttribute("sessionkey", "!234567");// you can share any data using session also
			response.sendRedirect("ProfileServletHttps");
		}
		else {
			out.println("Invalid user or pass");
		}
	}

}
