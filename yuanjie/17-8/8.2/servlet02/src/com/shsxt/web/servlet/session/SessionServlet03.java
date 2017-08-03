package com.shsxt.web.servlet.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet03 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		String obj = (String)s.getAttribute("s02");
		System.out.println("取到s02设置的值："+obj);
		s.removeAttribute("s02");
		String obj2 = (String)s.getAttribute("s02");
		System.out.println("删除s02设置的值后："+obj2);
		
	}

}
