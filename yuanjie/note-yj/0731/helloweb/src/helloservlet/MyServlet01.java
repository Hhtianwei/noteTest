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
		System.out.println("����get����");
		// getParamter ��ȡ��һ�����ַ���
		// ��ȡ�������
		
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String age = request.getParameter("age");
		System.out.println("uname " + uname);
		System.out.println("pwd " + pwd);
		System.out.println("age " + age);
		
		// ����ֻ�ܳ���һ���� ����Ч��
		//resp.getOutputStream(); // �ֽ�������� ˭�����ң� �Ҿ͸�˭�Խ�
		PrintWriter out = response.getWriter();// �ַ������
		out.print("<h1>This is first myServlet</h1>");
		out.flush();
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("����post����");
	}
	
}
