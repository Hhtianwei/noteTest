package com.shsxt.yuanx.buffered;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.InputStream;

public class BufferedInputStreamtest01 {
	public static void mian(String[] args) throws Exception {
		File file = new File("E:\\ceshi\\ceshi.txt");
		InputStream is = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(is);
		byte[] bs = new byte[1024];
		int len = -1;
		while ((len = bis.read(bs)) != -1) {
			String str = new String(bs, 0, len);
			System.out.println(str);
		}
		bis.close();
		is.close();
	}
}
