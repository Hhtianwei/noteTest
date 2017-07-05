package com.shsxt.yuanx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader03 {
	public static void main(String[] args) throws Exception {
		File f = new File("E:\\ceshi\\ceshi.txt");
		FileReader is = new FileReader(f);
		char[] cs = new char[100];
		int len = -1;
		while ((len = is.read()) != -1) {
			String str = new String(cs, 0, len);
			System.out.println(str);
		}
		is.close();
	}
}
