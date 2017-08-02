package com.shsxt.fileclass;

import java.io.File;

public class TestFile2 {
	public static void main(String[] args) {
		File file = new File("D:\\aaa");
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File temp : files){
				String str = temp.getName();
//				System.out.println(str);
				String str1 = str.substring(str.lastIndexOf(".")+1);
				System.out.println(str1);
			}
		}
	}
}
