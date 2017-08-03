package com.shsxt.yuanx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("uanme");
		String pwd = req.getParameter("pwd");
		String rem = req.getParameter("remember");

		PrintWriter out = resp.getWriter();
		if ("xiaohua".equals(name) && "yuanx".equals(pwd)) {
			out.print("登陆成功");
			resp.setHeader("refresh", "url=source.html");
		} else {
			out.print("登录失败");
			resp.setHeader("refresh", "3,url=http://localhost:8080/login/faild.html");
		}

	}

}
