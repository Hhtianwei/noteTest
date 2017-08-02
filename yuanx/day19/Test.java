package com.shsxt.yuanx;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test {
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getByName("192.168.1.110");
		DatagramSocket socket = new DatagramSocket();
		Float f = 9.0f;
		String str = f.toString();
		byte[] bs = str.getBytes();
		DatagramPacket packet = new DatagramPacket(bs, bs.length, addr, 8888);
		socket.send(packet);
		System.out.println("============");
		DatagramSocket socket1 = new DatagramSocket(6666);
		byte[] by = new byte[1024];
		DatagramPacket packet1 = new DatagramPacket(by, by.length);
		socket1.receive(packet1);
		int len = packet.getLength();
		String msgstr = new String(by, 0, len);
		System.out.println(msgstr);

	}
}
