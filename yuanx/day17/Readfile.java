package com.shsxt.yuanx;

import java.io.File;
import java.io.FileInputStream;

import java.io.InputStream;

public class Readfile {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\ceshi\\ceshi.txt");
		InputStream in = null;
		in = new FileInputStream(file);
		byte[] car = new byte[1024];
		int len = 0;
		while ((len = in.read(car)) != -1) {
			String info = new String(car, 0, len);
			System.out.println(info);
		}
		if (in != null) {
			in.close();

		}
	}
}
