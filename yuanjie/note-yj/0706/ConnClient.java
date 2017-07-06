package com.shsxt.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ConnClient {
	public static void main(String[] args) throws Exception {
		
		DatagramSocket client = new DatagramSocket();
		DatagramSocket server = new DatagramSocket(9898);
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		byte[] bs = null;
		byte[] remsg = null;
		DatagramPacket packet = null;
		DatagramPacket packet1 = null;
		
		while(true){
			str = sc.nextLine();
			bs = str.getBytes();
			packet = new DatagramPacket(bs,bs.length,InetAddress.getLocalHost(),8989);
			client.send(packet);
			
			remsg = new byte[1024];
			packet1 = new DatagramPacket(remsg,remsg.length);
			server.receive(packet1);
			int len = packet1.getLength();
			System.out.println(new String(remsg,0,len));
		}
		
		/*InetAddress addr = InetAddress.getLocalHost();
		DatagramSocket client = new DatagramSocket();
		DatagramSocket server = new DatagramSocket(6666, addr);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = null;
		Scanner sc = new Scanner(System.in);
//		while ((line = br.readLine())!=null) {
		while(true){
			String str = sc.nextLine();
			byte[] bs = str.getBytes();
			DatagramPacket packet = new DatagramPacket(bs, bs.length, addr, 6968);
			client.send(packet);

			//接收
			byte[] bt = new byte[1024];
			DatagramPacket packet1 = new DatagramPacket(bt,bt.length);
			server.receive(packet1);
			int len = packet1.getLength();
			System.out.println(new String(bt, 0, len));
		}*/

	
		
		}
}
