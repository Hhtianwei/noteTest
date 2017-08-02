package com.shsxt.net;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8866);
		
			Socket client = server.accept();
			InputStream is = client.getInputStream();
			byte[] bs = new byte[1024];
			int len = is.read(bs);
			System.out.println(new String(bs, 0, len));
		
		// client.close();
	}
}
