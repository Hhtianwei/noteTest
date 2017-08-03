package com.shsxt.web.servlet.session02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServletInvalidate01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		String id = s.getId();
		System.out.println("s01-id:"+id);
		// session的失效
		// 1、关闭浏览器
		// 2、手动调用 invalidate()
//		s.invalidate();
//		s = request.getSession();
//		id = s.getId();
//		System.out.println("s01-invalidate-id:"+id);
		
		// 3、不活动时间达到最大值
		s.setMaxInactiveInterval(5);
		
	}

}
