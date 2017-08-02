package com.shsxt.fileclass;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File file = new File("F:\\shsxt\\实战\\day13");
		diGui(file);
	}

	// 利用递归列出某个目录下全部文件
	public static void diGui(File file) {
		if(file != null){
			if(file.isDirectory()){
				File[] files = file.listFiles();
				for(File temp : files){
					if(temp.isFile()){
						System.out.println(temp);
					}
					diGui(temp);
				}
			}
		}
	}
	
	public static void move(File file1,File file2) throws IOException{
		if(file1!= null){
			String str = file1.getName();
			File file = new File(file2,str);
			boolean flag = file.createNewFile();
			if(flag){
				file1.delete();
			}
		}
	}
}
