package com.shsxt.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 登录的servlet
 * 1、获取登录信息， 请求数据
 * 2、对数据进行判断
 * 		成功：保存数据.跳转到 source.html
 * 		失败：跳转到 fail.html
 */
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 1、获取数据
		String name = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		// 2、判断信息    刘诗诗, 123
		if("刘诗诗".equals(name)&&"123".equals(pwd)){
			// 存储数据
			HttpSession s = request.getSession();
			s.setAttribute("n", name);
			s.setAttribute("p", pwd);
			// 此时两个都可以
			// 请求转发 ：
			//request.getRequestDispatcher("source.html").forward(request, response);
			// 重定向：
			response.sendRedirect("source.html");
		}else{
			response.sendRedirect("fail.html");
		}
	}

}









