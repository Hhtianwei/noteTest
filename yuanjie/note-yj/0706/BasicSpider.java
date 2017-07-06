package com.shsxt.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class BasicSpider {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.baidu.com/");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("baidu.html"))));
		String str = null;
		while((str = br.readLine())!=null){
			bw.write(str);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
}
