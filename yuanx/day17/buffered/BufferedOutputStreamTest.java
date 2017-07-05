package com.shsxt.yuanx.buffered;

import java.io.BufferedOutputStream;
import java.io.File;

import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\ceshi\\ceshi.txt");
		wirte01(file);
	}

	public static void wirte01(File file) throws Exception {
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "锄禾日当午，码农真心苦，一本小破书，一读一整天";
		bos.write(str.getBytes(), 0, str.getBytes().length);
		bos.flush();
		bos.close();
		fos.close();
	}
}
