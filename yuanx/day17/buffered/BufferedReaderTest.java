package com.shsxt.yuanx.buffered;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderTest {
	public static void main(String[] args) throws Exception {
		File file = new File("E://ceshi//ceshi.txt");
		Reader r = new FileReader(file);
		BufferedReader br = new BufferedReader(r);
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		r.close();
	}
}
