package com.shsxt.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
 * 当作服务器端：   接收数据
 * 1、创建服务器， 指定端口   DatagramSocket
 * 2、准备容器接收数据   DatagramPacket + byte[]
 * 3、接收数据   receive()
 * 4、处理数据
 * 5、释放资源
 */
public class UdpServer {
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		// 创建服务器， 工具
		DatagramSocket server = new DatagramSocket(8888,addr);
		// 容器
		byte[] bs = new byte[1024];
		// 数据报包
		DatagramPacket packet = new DatagramPacket(bs,bs.length);
		// 接收数据
		server.receive(packet);
		// 获取接收到的数据的长度
		int len = packet.getLength();
		String str = new String(bs,0,len);
		System.out.println(str);
		// 释放资源
		server.close();
	}
}
