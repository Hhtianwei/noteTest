package com.shsxt.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnTcpServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8090);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		s.close();
		
	}
}
