package com.shsxt.yuanx;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务器端：
 * 创建服务，等待连接,接收数据
 */
public class TcpServer {
	public static void main(String[] args) throws Exception {
		// 创建服务
		ServerSocket server = new ServerSocket(8888);

		// 获取连接， 获取客户端信息
		Socket client = server.accept();
		// 容器接收数据
		InputStream is = client.getInputStream();
		byte[] by = new byte[1024];
		int len = is.read(by);
		System.out.println(new String(by, 0, len));
		
	}

}
