package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	doGet(request,response);}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String domain=request.getParameter("domain");
		//String number=String.valueOf("number");
		String number=request.getParameter("number");
		if(firstname.isEmpty()||lastname.isEmpty()||domain.isEmpty()||number.isEmpty()){
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request,response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request,response);
		}
		
	}
		
}
