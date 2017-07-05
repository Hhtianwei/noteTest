package com.shsxt.yuanx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CopyFileChar {
	public static void mian(String[] name) {
		
	}

	public static void copyFile(File src, File dest) throws Exception {
		// 准备输入
		Reader r = new FileReader(src);
		BufferedReader br = new BufferedReader(r);
		// 准备输出
		Writer w = new FileWriter(dest);
		BufferedWriter bw = new BufferedWriter(w);
		String temp = null;// 输入输出的数据
		// 判断
		while ((temp = br.readLine()) != null) {
			bw.write(temp);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		w.close();
		br.close();
		r.close();
	}
}
