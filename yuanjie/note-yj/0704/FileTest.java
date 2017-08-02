package com.shsxt.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("F:\\A\\B\\FileInputStream02.java");
		InputStream is = null;
		try {
			is = new FileInputStream(file);
			int b = -1;
			while ((b = is.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (IOException e) {
			System.out.println("NotFoundFile");
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
