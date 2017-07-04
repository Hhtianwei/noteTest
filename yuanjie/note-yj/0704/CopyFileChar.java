package com.shsxt.io.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 字符流拷贝：纯文本
 */
public class CopyFileChar {
	public static void main(String[] args)throws Exception{
		File src = new File("F:\\A\\C\\c.txt");
		File dest = new File("F:\\A\\C\\copyc.txt");
		copyFile(src,dest);
	}
	
	public static void copyFile(File src,File dest) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
		
		String temp = null;
		while((temp = br.readLine())!=null){
			bw.write(temp);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
