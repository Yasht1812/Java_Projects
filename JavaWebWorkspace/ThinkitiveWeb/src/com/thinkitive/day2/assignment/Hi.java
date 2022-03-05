package com.thinkitive.day2.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Hi
 */
@WebServlet("/Hi")
public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Integer counter = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Hi() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();// Open session if exists else create new
		counter = (Integer) session.getAttribute("count");
		if (counter != null) {
			counter++;
			session.setAttribute("count", counter);// you can share any data using session also
		} else {
			counter = 0;
			counter++;
			session.setAttribute("count", counter);
			
		}
		response.getWriter().println("Hi no of count: "+counter);
	}

}
