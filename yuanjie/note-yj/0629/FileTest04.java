package com.shsxt.fileclass;

import java.io.File;

/*
 * list() -> 返回当前目录下所有的文件和文件夹的  字符串(文件|文件夹的名称)形式   字符串数组
 * listFiles() -> 返回当前目录下所有的文件和文件夹的  字符串形式  文件数组
 */
public class FileTest04 {
	public static void main(String[] args) {
		File file = new File("F:\\shsxt\\实战");
		String[] fileStr = {};
		// 确保该目录存在， 判断
		if (file.exists()) {
			fileStr = file.list();
		}
		for (String temp : fileStr) {
			System.out.println(temp);
		}
		
		System.out.println("===================");
		File[] files = file.listFiles();
		for(File temp : files){
			System.out.println(temp);
		}
	}
}
