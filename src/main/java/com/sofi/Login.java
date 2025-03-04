package com.sofi;

import java.io.IOException;

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
		
		if(request.getParameter("user").equals(request.getParameter("pwd"))) {
			response.sendRedirect("success.html");  //send to a physical page
		}else {
			response.sendRedirect("fail.html");
		}
	}

}
