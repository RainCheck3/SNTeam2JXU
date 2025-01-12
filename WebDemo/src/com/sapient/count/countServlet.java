package com.sapient.count;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class countServlet
 */
public class countServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int count;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public countServlet() {
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
		PrintWriter out = response.getWriter();

		out.write("<html>");
		out.write("<head>");
		out.write("</head>");
		out.write("<body>");
		out.write("<h2>" + (++count) + "</h2>");

		out.write(request.getLocalAddr() + "<br/>");

		Enumeration<String> headerNames = request.getHeaderNames();
		String headerName;

		while (headerNames.hasMoreElements()) {
			headerName = headerNames.nextElement();
			out.write(headerName + ": " + request.getHeader(headerName)
					+ "<br/>");
		}

		out.write("</body>");
		out.write("</html>");

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
