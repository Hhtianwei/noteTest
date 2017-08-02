package com.shsxt.yuanx;

import java.io.File;
import java.io.FileInputStream;

import java.io.InputStream;

public class FileInputStream03 {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\ceshi\\ceshi.txt");
		InputStream in = null;
		in = new FileInputStream(file);
		long fileLength = file.length();
		long num = 0;
		while (num < fileLength) {
			char ch = (char) in.read();
			System.out.println(ch);
			num++;
		}
		if (in != null) {
			in.close();
		}
	}
}