package com.shsxt.yuanx;

import java.io.*;

/*IO流的操作步骤：
* 字节输入流为例
* 1、建立联系   File
* 2、选择流 （输入/输出, 字节/字符）
* 3、操作（读取/写出）
* 4、释放资源*/
public class InputStreamTest {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\ceshi\\ceshi.txt");
		FileInputStream fin = new FileInputStream(file);
		int a = fin.read();
		System.out.println(a);
		fin.close();
		System.out.println(file.length());
	}
}
