package com.gbp.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public TestDbServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// setup connnection variables
		String user = "springstudent";
		String pass = "springstudent";

		String jdbcUrl = "jdbc:mysql://localhost:3306/smart-class?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";

		// get connection to database
		try {
			PrintWriter out = response.getWriter();
			out.println("connection to database: " + jdbcUrl);

			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

			out.println("SUCCESS!!!");

			myConn.close();

		} catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
