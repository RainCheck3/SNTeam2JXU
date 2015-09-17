package com.sapient.input;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inputServlet
 */
public class inputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String trueLove;

	@Override
	public void init(ServletConfig config) throws ServletException {
		trueLove = config.getServletContext().getInitParameter("True Love");
	}
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public inputServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		out.write("<html>");
		out.write("<head>");
		out.write("</head>");
		out.write("<body>");
		out.write("First name: " + request.getParameter("firstname") + "<br/>");
		out.write("Password: " + request.getParameter("psw") + "<br/>");
		out.write("Gender: " + request.getParameter("sex") + "<br/>");
		
		if(request.getParameter("vehicle1") != null) {
			out.write("You have a " + request.getParameter("vehicle1") + "<br/>");
		}
		if(request.getParameter("vehicle2") != null) {
			out.write("You have a " + request.getParameter("vehicle2") + "<br/>");
		}
		
		out.write("Button value: " + request.getParameter("btn") + "<br/>");
		out.write("Your true love is: " + trueLove + "<br/>");
		
		out.write("</body>");
		out.write("</html>");

	}

}
