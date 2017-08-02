package com.shsxt.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {
	public static void main(String[] args) {
		//建立联系
		File file = new File("f:\\A\\D.txt");
		//选择流
		try {
			FileInputStream fis = new FileInputStream(file);
//			int c = fis.read();
//			int c1 = fis.read();
//			int c2 = fis.read();
			byte[] b= new byte[1024];
			fis.read(b);
			System.out.println(new String(b));
			
//			System.out.println(c);
		} catch (FileNotFoundException e) {
			System.out.println("找不到指定文件");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
