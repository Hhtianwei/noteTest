package com.shsxt.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) throws Exception{
		File file = new File("F:\\A\\a.txt");
		OutputStream os = new FileOutputStream(file);
		String str = "你好China";
		os.write(str.getBytes());
		os.flush();
		os.close();
	}
}
