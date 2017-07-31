package helloservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/*
 * 生命周期：
 * init();
 * service();
 * desroty();
 */
public class LifeTest implements Servlet {
	// 声明周期方法， 在servlet对象被销毁时（之前）会自动执行
	@Override
	public void destroy() {
		System.out.println("destroy():servlet对象被销毁时（之前）会自动执行");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	// 是一个生命周期方法， 在Servlet对象被初始化时执行
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init():Servlet对象被初始化时执行");
	}

	// 是声明周期方法， 在每次处理请求的时候被执行
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service():在每次处理请求的时候被执行");
	}

}



