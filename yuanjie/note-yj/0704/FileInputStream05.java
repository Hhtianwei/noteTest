package com.shsxt.io.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

/*读取文件： 字节流的形式读取
 * 不管是内存还是磁盘，不管是GBK还是UTF-8对于英文都只占一个字节
 * 1、只含有英文  -》 一定不会出乱码
 * 2、只含有中文
 * 		字节流：
 * 			文件实际编码， (因为读取的是字节，所以读取时每次获取几个字节，由字节数组决定)读取文件时 指定的编码（如果没指定则使用当前环境的编码格式） 
 * 			GBK			UTF-8						一定乱码（能救）
 * 			GBK			GBK							可能乱也可能不乱（字节数不够，当字节数够的时候，就不乱）
 * 			UTF-8       UTF-8						可能乱也可能不乱（字节数不够，当字节数够的时候，就不乱）
 * 			UTF-8       GBK							一定乱（能救）
 * 		字符流：
 * 			GBK			只能以当前环境的编码格式去读取UTF-8        一定乱，而且没法救
 * 			UTF-8		只能以当前环境的编码格式去读取UTF-8        不乱
 * 2、既含有中文又含有英文
 * 		字节流：
 * 			GBK			GBK可能乱码
 * 			GBK			UTF-8  一定乱码
 * 			UTF-8   	GBK一定乱
 * 			UTF-8   	UTF-8可能乱
 * 		字符流：
 * 
 */
public class FileInputStream05 {
	public static void main(String[] args)throws Exception{
		File f1 = new File("F:\\A\\a.txt"); // GBK
		File f2 = new File("a.txt");  // UTF-8
		read02(f2);
	}

	// 字符流读取
		public static void read02(File file)throws Exception{
			FileReader fr = new FileReader(file);
			char[] cs = new char[4];
			int len = -1;
			while((len=fr.read(cs))!=-1){
				// 只能通过指定字符个数来创建字符串，没有机会指定编码格式
				String str  = new  String(cs,0, len);
				System.out.println(str);
				
			}
			
			fr.close();
		}
	

	// 读取纯英文文件
	public static void read01(File file) throws Exception{
		FileInputStream fis = new FileInputStream(file);
		byte[] bs = new byte[2]; //1,2,3,4
		int len = -1;
		
		while((len=fis.read(bs))!=-1){
			// 利用字符串的构造方法，将字节数组， 转换成字符串 -》 可以指定编码格式UTF-8   UTF-8  
			String str = new String(bs,0,len,"UTF-8");
			System.out.println(str);
			
			/*byte[] b = str.getBytes("UTF-8"); 
			str = new String(b,0,b.length,"UTF-8");
			System.out.println(str);*/
			
		}
		fis.close();
	}
	
	
	
}









