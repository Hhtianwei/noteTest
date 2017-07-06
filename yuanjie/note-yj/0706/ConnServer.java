package com.shsxt.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ConnServer {
	public static void main(String[] args) throws Exception {
		// 1、准备接收 工具
		DatagramSocket server = new DatagramSocket(8989);
		// 发送工具
		DatagramSocket client = new DatagramSocket();
		
		byte[] content = null;
		DatagramPacket packet = null;
		byte[] msg = null;
		DatagramPacket packet1 = null;
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		while(true){
			// 接收
			// 2、准备容器
			content = new byte[1024];
			// 3、包装容器
			packet = new DatagramPacket(content,content.length);
			// 4、接收数据
			server.receive(packet);
			int len = packet.getLength();
			System.out.println(new String(content,0,len));
			
			str = sc.nextLine();
			// 发送
			// 发送的数据
			msg = str.getBytes();
			// 包装
			packet1 = new DatagramPacket(msg,msg.length,InetAddress.getLocalHost(),9898);
			client.send(packet1);
		}
		
		/*InetAddress addr = InetAddress.getByName("localhost");
		DatagramSocket server = new DatagramSocket(6968);
		DatagramSocket client = new DatagramSocket();
		Scanner sc = new Scanner(System.in);
		while (true) {
			//接收
			//准备容器
			byte[] bs = new byte[1024];
//			包装容器
			DatagramPacket packet = new DatagramPacket(bs,bs.length);
//			接收数据
			server.receive(packet);
			int len = packet.getLength();
			System.out.println(new String(bs, 0, len));

			String str = sc.nextLine();
//			发送
//			发送的数据
			byte[] bt = str.getBytes();
//			包装
			DatagramPacket packet1 = new DatagramPacket(bt, bt.length, addr, 6666);
			client.send(packet1);
		}
//		接收端应该一直开着等待接收数据，是不需要关闭的
//		server.close();
*/

	}
}
