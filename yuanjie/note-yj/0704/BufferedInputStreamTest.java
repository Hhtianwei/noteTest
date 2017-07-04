package com.shsxt.io.input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputStreamTest {
	public static void main(String[] args) throws Exception {
		File file = new File("a.txt");
		InputStream is = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(is);
		byte[] bs = new byte[1024];
		int len = -1;
		while((len = bis.read(bs))!= -1){
			String str = new String(bs,0,len);
			System.out.println(str);
		}
		bis.close();
		is.close();
	}
}
