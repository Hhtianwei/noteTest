package helloservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/*
 * �������ڣ�
 * init();
 * service();
 * desroty();
 */
public class LifeTest implements Servlet {
	// �������ڷ����� ��servlet��������ʱ��֮ǰ�����Զ�ִ��
	@Override
	public void destroy() {
		System.out.println("destroy():servlet��������ʱ��֮ǰ�����Զ�ִ��");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	// ��һ���������ڷ����� ��Servlet���󱻳�ʼ��ʱִ��
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init():Servlet���󱻳�ʼ��ʱִ��");
	}

	// ���������ڷ����� ��ÿ�δ��������ʱ��ִ��
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service():��ÿ�δ��������ʱ��ִ��");
	}

}



