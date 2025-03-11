package com.sofi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Login() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		if(request.getParameter("user").equals(request.getParameter("pwd"))) {
//			response.sendRedirect("success.html");  //send to a physical page
//		}else {
//			response.sendRedirect("fail.html");
//		}
		
		RequestDispatcher rd = request.getRequestDispatcher("AddServlet2");  //move to another servlet
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		PrintWriter pw = response.getWriter();
		pw.print(user + " " + pwd);
		//RequestDispatcher rd = request.getRequestDispatcher("success.html"); //move to a html page
		//rd.forward(request, response);
		rd.include(request, response); //included in the page 
		
	}

}
