package com.shsxt.net;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TestClient {
	
	public static void main(String[] args) throws Exception {
		InetSocketAddress addr = new InetSocketAddress("192.168.1.110",8888);
		DatagramSocket client = new DatagramSocket();
		String str = "我不要double，我要int";
		byte[] by = str.getBytes();
		DatagramPacket packet = new DatagramPacket(by,by.length,addr);
		client.send(packet);
		
		byte[] bs = new byte[1024];
		DatagramSocket rec = new DatagramSocket(6666);
		DataOutputStream dis = new DataOutputStream(new ByteArrayOutputStream());
//		double d = dis.readDouble();
//		DatagramPacket packet1 = new DatagramPacket();
	}
}
