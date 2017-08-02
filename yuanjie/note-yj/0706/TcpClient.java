package com.shsxt.net;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getByName("192.168.1.105");
		Socket socket = new Socket(addr, 8866);

		while (true) {
			OutputStream os = socket.getOutputStream();
			byte[] bs = new Scanner(System.in).nextLine().getBytes();
			os.write(bs);
			os.flush();
		}
		// os.close();
	}
}
