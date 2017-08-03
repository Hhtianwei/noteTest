package com.shsxt.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("3s to shsxt");
		
//		response.setHeader("refresh","3;http://www.shsxt.com");
		response.setHeader("refresh","2");
		
	}

}
