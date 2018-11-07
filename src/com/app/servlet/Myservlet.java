package com.app.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Myservlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("It is From init method");
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("It is From service method");
	}
	public void destroy() {
		System.out.println("It is from destroy method");
		System.out.println("It is from destroy method");
		System.out.println("It is from destroy method");
	}


}
