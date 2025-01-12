package com.sapient.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Calendar timeofServletLoad;
	Calendar currentTime;
	String hobbies;
	String trueLove;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GreetingServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		timeofServletLoad = Calendar.getInstance();

		hobbies = config.getInitParameter("Hobbies");
		trueLove = config.getServletContext().getInitParameter("True Love");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		currentTime = Calendar.getInstance();
		String firstname = request.getParameter("firstname");

		PrintWriter out = response.getWriter();

		out.println("<div style=\"color:blue\">Hello " + firstname + "</div>");

		out.println("Time of load: "
				+ new SimpleDateFormat("HH:mm:ss z MM/dd/yy")
						.format(timeofServletLoad.getTime())
				+ "<br/> Current time: "
				+ new SimpleDateFormat("HH:mm:ss z MM/dd/yy")
						.format(currentTime.getTime()) + "<br/>");

		out.println("Your hobbies are: " + hobbies + "<br/>");
		out.println("Your true love is: " + trueLove + "<br/>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
