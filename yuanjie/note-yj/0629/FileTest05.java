package com.shsxt.fileclass;

import java.io.File;
import java.io.IOException;

/*
 * 列出某磁盘下的文件和文件夹
 * 某个目录文件过滤(查找出文件) 打印出所有的文件名称|绝对路径     如果是文件夹  则不打印
 * 利用递归列出某个目录下全部文件
 * 	d:\\6.25   
 * 		File[] filse = listFiles()
 * 		fisle[0] -> 文件  -》 打印
 * 				 -> 文件夹 -》File[] fs =   filse[0].listFiles()
 * 						fs[0] -> 文件   打印
 * 							  -> 文件夹    
 * 
 * 	移动文件   
 * 		先获取源头（将被移动的文件）  -》 在某个地方， 按照源头创建一份一模一样的文件（名字一样即可）
 * 		将原来的文件删除
 * 			
 */
public class FileTest05 {
	public static void main(String[] args) throws IOException {
		// find();
		File file = new File("F:\\shsxt\\实战\\day13");
		find1(file);
		System.out.println("=================================");
		find2(file);

		File file1 = new File("F:\\A\\Test.java");
		File file2 = new File("F:\\java");
		move(file1, file2);
	}

	// 列出某磁盘下的文件和文件夹
	public static void find() {
		File file = new File("F:\\");
		String[] str = file.list();
		for (String temp : str) {
			System.out.println(temp);
		}
	}

	// 某个目录文件过滤(查找出文件)
	public static void find1(File file) {
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (!files[i].isFile()) {
				continue;
			}
			System.out.println(files[i]);
		}
	}

	// 利用递归列出某个目录下全部文件
	public static void find2(File file) {
		if (file != null) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				for (File temp : files) {
					if (temp.isFile()) {
						System.out.println(temp);
					}
					find2(temp);
				}
			}
		}
	}

	// 移动文件
	public static void move(File src, File copy) throws IOException {
		if (src != null) {
			String str = src.getName();
			File file = new File(copy, str);
			boolean flag = file.createNewFile();
			if (flag) {
				src.delete();
			}
		}
	}
}
