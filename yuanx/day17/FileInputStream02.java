package com.shsxt.yuanx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream02 {
	public static void main(String[] args) throws Exception {
		File f = new File("E:\\ceshi\\ceshi.txt");
		InputStream in = new FileInputStream(f);
		int i = -1;
		while ((i = in.read()) != -1) {
			System.out.println((char) i);
		}
		if (in != null) {
			in.close();
		}
	}
}