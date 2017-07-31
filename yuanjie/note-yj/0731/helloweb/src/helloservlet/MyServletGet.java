package helloservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 1、测验使用get方式请求时，执行的是哪个（哪些）方法-->doGet();
 * 2、将doPost方法去掉，  通过post方式请求，执行的是什么方法-->service();
 * 3、再将service方法去掉， 能得到什么结果-->doGet();
 */
public class MyServletGet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("get请求");
	}
	
//	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
//		System.out.println("post请求");
//	}
	
//	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
//		System.out.println("service方法");
//	}

}
