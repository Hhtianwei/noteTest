package com.shsxt.yuanx;

import java.io.File;
import java.io.FileWriter;

import java.io.Writer;

public class FileWriterTest {
	public static void main(String[] args) throws Exception {
		File f = new File("E:\\ceshi\\b.txt");
		write(f);

	}

	public static void write(File f) throws Exception {
		Writer w = new FileWriter(f);
		w.write('c');
		w.flush();
		w.close();
	}
}
