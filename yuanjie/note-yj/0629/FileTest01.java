package com.shsxt.fileclass;

import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("F:\\shsxt\\实战\\day13");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isDirectory());// 是否是一个目录|文件夹
		System.out.println(file.isFile());// 是否一个文件
		System.out.println("==========");
		
		file = new File("F:\\shsxt\\实战\\day13\\DateTest01.java");
		System.out.println(file.isDirectory());// 是否是一个目录|文件夹
		System.out.println(file.isFile());// 是否一个文件
		System.out.println("==========");
		
		File parent = new File("F:\\shsxt\\实战\\day13");
		File file1 = new File(parent,"DateTest01.java");
		System.out.println(file.isDirectory());// 是否是一个目录|文件夹
		System.out.println(file.isFile());// 是否一个文件
		
		System.out.println("==========");
		String str = File.separator;
		System.out.println(str);
		String str1 = "F:";
		String str2 = "shsxt\\实战";
		String str3 = "day13";
		File f = new File(str1+str+str2+str+str3);
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
	}
}













