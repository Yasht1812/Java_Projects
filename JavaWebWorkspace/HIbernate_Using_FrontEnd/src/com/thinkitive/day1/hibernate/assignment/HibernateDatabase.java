package com.thinkitive.day1.hibernate.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.thinkitive.day1.hibernate.assignment.Employee;
/**
 * Servlet implementation class HIbernateDatabase
 */
@WebServlet("/HibernateDatabase")
public class HibernateDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HibernateDatabase() {
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
		int id = Integer.parseInt(request.getParameter("txtempid"));
		String name = request.getParameter("txtename");
		int sal = Integer.parseInt(request.getParameter("txtsalary"));
		MyDbConnection db = new MyDbConnection();
		
		db.insertEmployee(new Employee(id, name, sal));
		out.println(db.displayEmployee());
		
	}

}
