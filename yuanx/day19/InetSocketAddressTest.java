package com.shsxt.yuanx;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetSocketAddressTest {
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		// 计算机名字+ip
		InetSocketAddress add = new InetSocketAddress(addr, 8888);
		// 计算机名字+ip+端口
		System.out.println(addr);
		System.out.println(add);
		InetAddress addr1 = InetAddress.getLocalHost();

		// 根据ip地址定位到某台计算机， 当我知道对方的ip地址
		addr1 = InetAddress.getByName("192.168.0.110");

		// 根据域名定位某台计算机
		addr1= InetAddress.getByName("LAPTOP-66P3AB29");

		System.out.println(addr.getHostAddress());

		// 定位某他计算机
		// ip
		addr1 = InetAddress.getByName("192.168.1.117");
		System.out.println(addr1.getHostAddress());

		// 域名
		/*
		 * addr1 = InetAddress.getByName("www.baidu.com");
		 * System.out.println(addr1);
		 */
	}
}
