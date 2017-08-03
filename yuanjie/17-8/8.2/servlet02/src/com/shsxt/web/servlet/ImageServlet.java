package com.shsxt.web.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setHeader("content-type","image/jpg");
		
		// 1、找源头, 获取资源的真实路径
		String realpath = request.getServletContext().getRealPath("/m.jpg");
		InputStream is = new FileInputStream(new File(realpath));
		
		// 2、找目的地
		ServletOutputStream out = response.getOutputStream();
		
		// 3、搬运
		int len = -1;
		byte[] bs = new byte[is.available()];
		while((len=is.read(bs))!=-1){
			out.write(bs,0, len);
		}
		out.flush();
		out.close();
		out.close();
		
		
	} 
}
