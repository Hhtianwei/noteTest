package com.shsxt.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseServlet02 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * response.setCharacterEncoding("UTF-8"); // 告知服务器
		 * response.setHeader("content-type", "text/html;charset=UTF-8"); //告知客户端
		 */
		response.setContentType("text/html;charset=utf-8");

		// 字符流响应数据 中文，一定乱码
		PrintWriter out = response.getWriter(); // 内部使用ISO-8859-1，但是我可以设定一下，我们服务使用的编码格式
		out.print("我不可能会乱码");
		out.flush();
		out.close();
	}

}
