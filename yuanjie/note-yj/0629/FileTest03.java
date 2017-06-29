package com.shsxt.fileclass;

import java.io.File;

/*
 * 相对路径和绝对路径：加不加盘符
 */
public class FileTest03 {
	public static void main(String[] args){
		File file = new File("F:\\shsxt\\实战\\day13");
		System.out.println(file.getPath());// 获取文件|目录的路径
		System.out.println(file.getAbsolutePath());// 获取绝对路径
		
		File file1 = new File("实战\\day130");// 相对于当前工作空间，来定位目录|文件
		System.out.println(file1.getPath());// 获取文件|目录的路径
		System.out.println(file1.getAbsolutePath());// 获取绝对路径
		
	}
}
