package com.shsxt.yuanx;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 资源的servlet 
 * 1、判断用户是否已经登录 
 * 2、根据判断结果进行不同操作 
 * 已经登录: 跳转到 source.html 
 * 没有登录: 跳转到
 */
public class SourceServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String n=(String) session.getAttribute("n");
		String p=(String) session.getAttribute("p");
		if(n!=null&&p!=null){
			request.getRequestDispatcher("source.html").forward(request, response);
		}else{
			request.getRequestDispatcher("login.html").forward(request, response);
		}
	}
}
