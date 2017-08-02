package com.shsxt.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream02 {
	public static void main(String[] args) {
		//建立联系
		File file = new File("F:\\A\\B\\FileInputStream02.java");
		//选择流
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			int b = -1;
			//循环读取操作
			while ((b = in.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (IOException e) {
			System.out.println("NotFountFile");
		} finally {
			if (in != null) {
				try {
					//释放资源
					in.close();
				} catch (IOException e) {
					System.out.println("Close Exception");
				}
			}
		}
	}
}
