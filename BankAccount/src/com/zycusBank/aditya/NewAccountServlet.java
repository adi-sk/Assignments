package com.zycusBank.aditya;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewAccountServlet
 */
@WebServlet("/new-account.do")
public class NewAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("index.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String title = request.getParameter("title");
		int age = Integer.parseInt(request.getParameter("age"));
		Date dob = Date.valueOf(request.getParameter("date"));
	
		CustomerDAO custD = new CustomerDAO();
		
		if(firstName == null || firstName.equals("") || lastName == null || lastName.equals("") || title == null || title.equals("") || firstName == null){
			
			if(firstName.length() > 2 && lastName.length() >2){
				response.sendRedirect("index.html");
			}
		}
		
		PrintWriter out = response.getWriter();
		custD.create(new Customer(firstName, lastName, title, age, dob));		
		out.println("Your account creation request is under process");
	}
}
