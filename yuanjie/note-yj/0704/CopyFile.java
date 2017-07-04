package com.shsxt.io.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	public static void main(String[] args) throws Exception{
//		File src = new File("F:\\A\\c.txt");
//		File dest = new File("F:\\A\\copyc.txt");
//		copySimple(src,dest);
		File src = new File("F:\\A\\010（IO）.pdf");
		File dest = new File("F:\\A\\copyIO.pdf");
		copyFile(src,dest);
	}
	
	// 通过字节流拷贝文件
	// 将 src（必须存在）文件的内容 拷贝到 dest文件中
	// src: 读取
	// dest:写出
	public static void copySimple(File src,File dest) throws Exception{
		// 读
		InputStream is = new FileInputStream(src);
		BufferedInputStream bis = new BufferedInputStream(is);
		byte[] bs = new byte[is.available()];// 已经能够容纳文件中所有的内容了
		bis.read(bs);
		
		OutputStream os = new FileOutputStream(dest);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		bos.write(bs);
		bos.flush();
		bos.close();
		os.close();
		bis.close();
		is.close();
	}
	
	public static void copyFile(File src,File dest) throws Exception{
		// 准备输入，读取
		InputStream is = new FileInputStream(src);
		BufferedInputStream bis = new BufferedInputStream(is);
		
		// 准备输出，写出
		OutputStream os = new FileOutputStream(dest);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		// 临时空间
		byte[] bs = new byte[1024];
		// 记录真实数据的个数
		int len = -1;
		// 读取
		while((len = bis.read(bs))!= -1){
			bos.write(bs,0,len);
		}
		
		bos.flush();
		bos.close();
		os.close();
		bis.close();
		is.close();
	}
}
