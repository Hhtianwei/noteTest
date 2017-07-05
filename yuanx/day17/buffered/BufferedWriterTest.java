package com.shsxt.yuanx.buffered;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterTest {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\ceshi\\ceshi.txt");
		write01(file);
	}

	public static void write01(File file) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		String str1 = "锄禾日当午，";
		String str2 = "码农真心苦。";
		String str3 = "一本小破书，";
		String str4 = "一读一整天。";
		bw.write(str1);
		bw.newLine();

		bw.write(str2);
		bw.newLine();
		bw.write(str3);
		bw.newLine();
		bw.write(str4);
		bw.flush();
		bw.close();
	}

}
