package com.shsxt.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet{
	// 该servlet可能会接受到客户端的请求， 我自己处理不了， 我又不想去麻烦别人。 我可以临时的响应一些信息给客户端，在这些信息里边
	// 有一个非常有用 的信息， 给客户端指一条明路， 谁能解决这个问题   location 头给客户端
	// 客户端收到该响应后， 立刻马上自动地发送了另外一个请求， 到明路哪里   location
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.sendRedirect("redirect.html");
	}

}
