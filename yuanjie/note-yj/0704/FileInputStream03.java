package com.shsxt.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStream03 {
	public static void main(String[] args) throws Exception {
		File file = new File("a.txt");
		File file2 = new File("F:\\A\\D.txt");
		test01(file2);
	}
	
	public static void test01(File file) throws Exception{
		InputStream is = new FileInputStream(file);
		byte[] bs = new byte[100];
		int len = -1;
		
		while((len = is.read(bs))!= -1){
			String str = new String(bs,0,bs.length,"GBK");
			System.out.println(str);
		}
		
		is.close();
	}
}
