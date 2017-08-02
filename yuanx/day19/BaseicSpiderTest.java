package com.shsxt.yuanx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.URL;

/*网络爬虫low版本 ： 下载一个网页内容
* 要下载内容（读取内容）
* 1、获取流 （数据源）
* 	url -> 符合url格式的字符串， 定位到某个具体的资源
（协议：http,某台电脑：ip|域名， 资源路径， 端口）*/
public class BaseicSpiderTest {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.baidu.com/");
		// 字节流
		InputStream is = url.openStream();
		// 字符流 转换流
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(new File("baidu.html"))));
		String str = null;
		while ((str = reader.readLine()) != null) {
			writer.write(str);
			writer.newLine();
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
