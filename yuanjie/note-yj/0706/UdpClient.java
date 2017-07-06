package com.shsxt.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
 * 当作客户端：  主动发送消息
 * 1、知道将消息发送给谁： ip,port  	DatagramSocket
 * 2、给出发送的数据   DatagramPacket
 * 3、发送数据   
 * 4、释放资源
 */
public class UdpClient {
	public static void main(String[] args) throws Exception {
		// 定位计算机和端口    DatagramSocket InetAddress, InetSocketAddress
		InetAddress addr = InetAddress.getByName("192.168.1.104");
		// 客户端打算从哪个端口发送数据出去
		DatagramSocket client = new DatagramSocket();
		// 准备要发送的数据
		// 准备数据+封装
		String str = "小骚";
		byte[] bs = str.getBytes();
		DatagramPacket packet = new DatagramPacket(bs,bs.length,addr,6666);
		// 发送数据
		client.send(packet);
		// 释放资源
		client.close();
	}
}












