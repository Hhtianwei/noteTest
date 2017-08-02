package com.shsxt.fileclass;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) throws IOException{
		File file = new File("F:\\shsxt\\实战\\day13\\aa.txt");
//		boolean aa = file.createNewFile();// 创建一个文件
//		System.out.println(aa);
		boolean daa = file.delete();
		System.out.println(daa);
		System.out.println("=========");
		
//		boolean aa = file.mkdir();
//		System.out.println(aa);
	}
}
