package com.shsxt.yuanx;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
 * 当作客户端：  主动发送消息
 * 1、知道将消息发送给谁： ip,port  	DatagramSocket
 * 2、给出发送的数据   DatagramPacket
 * 3、发送数据   
 * 4、释放资源
 */
public class UdpClient {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();
		DatagramSocket socket1 = new DatagramSocket();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			byte[] bs = str.getBytes();
			DatagramPacket packet = new DatagramPacket(bs, bs.length, InetAddress.getByName(""), 9999);
			byte[] remsg = new byte[1024];

		}

	}
}
