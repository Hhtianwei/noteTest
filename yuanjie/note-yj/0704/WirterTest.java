package com.shsxt.io.output;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WirterTest {
	public static void main(String[] args) throws Exception {
		File file = new File("F:\\A\\c.txt");
		write(file);
	}
	public static void write(File file) throws Exception {
		Writer w = new FileWriter(file);
		String str = "hello中国";
		w.write(str);
		w.flush();
		w.close();
	}
}
