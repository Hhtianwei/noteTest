package helloservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 1������ʹ��get��ʽ����ʱ��ִ�е����ĸ�����Щ������-->doGet();
 * 2����doPost����ȥ����  ͨ��post��ʽ����ִ�е���ʲô����-->service();
 * 3���ٽ�service����ȥ���� �ܵõ�ʲô���-->doGet();
 */
public class MyServletGet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		System.out.println("get����");
	}
	
//	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
//		System.out.println("post����");
//	}
	
//	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
//		System.out.println("service����");
//	}

}
