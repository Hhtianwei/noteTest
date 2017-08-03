package com.shsxt.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseServlet01 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setHeader("content-type", "text/html;charset=utf-8");

		ServletOutputStream out = response.getOutputStream();
		out.write("怎么可能乱码".getBytes());
		out.flush();
		out.close();

	}

}
