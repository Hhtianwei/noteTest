package com.shsxt.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ConnTcpClient {
	public static void main(String[] args) throws IOException {
		//创建客户端Socket对象
		Socket s = new Socket("localhost",8090);
		
		//键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//把通道内的流给包装一下
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		s.close();
	}
}
