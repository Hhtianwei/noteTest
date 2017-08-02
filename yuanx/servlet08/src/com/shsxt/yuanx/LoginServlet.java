package com.shsxt.yuanx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		
		if("小花".equals(name)&&"yuanx".equals(pwd)){
			out.println("登陆成功");
			HttpSession s = request.getSession();
			s.setAttribute("n", name);
			s.setAttribute("p", pwd);
			response.setHeader("refresh", " 3,url=http://localhost:8080/servlet08/source.html");
		}else{
			out.println("登录失败请检查您的用户名和密码");
			response.setHeader("refresh", "3,url=http://localhost:8080/servlet08/faild.html");
		}
	}

}
