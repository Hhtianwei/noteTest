package helloservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("处理get请求");
		// getParamter 获取的一定是字符串
		// 获取请求参数
		
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String age = request.getParameter("age");
		System.out.println("uname " + uname);
		System.out.println("pwd " + pwd);
		System.out.println("age " + age);
		
		// 两者只能出现一个， 互斥效果
		//resp.getOutputStream(); // 字节输出流， 谁请求我， 我就跟谁对接
		PrintWriter out = response.getWriter();// 字符输出流
		out.print("<h1>This is first myServlet</h1>");
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("处理post请求");
	}
	
}
