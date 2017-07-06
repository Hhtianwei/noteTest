package com.shsxt.yuanx;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * 客户端：主动发起请求，连接， 
 */
public class TcpClient {
	public static void main(String[] args) throws Exception {
		// 创建客户端的套接字,建立连接
		Socket socket=new Socket(InetAddress.getLocalHost(),8888);
		OutputStream os=socket.getOutputStream();
		byte[]by="hello".getBytes();
		os.write(by);
		os.flush();
		os.close();
	}
}
