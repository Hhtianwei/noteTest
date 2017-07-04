package com.shsxt.io.input;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
	public static void main(String[] args) {
		File file = new File("F:\\A\\B\\G.txt");
		Reader r = null;
		try {
			r = new FileReader(file);
			int b = -1;
			while((b = r.read())!=-1){
				System.out.println((char)b);//打印出来为什么前面会有一个空格？
//				System.out.print((char)b);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(r != null){
				try {
					r.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
