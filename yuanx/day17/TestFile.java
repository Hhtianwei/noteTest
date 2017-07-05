package com.shsxt.yuanx;
//copy

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFile {
	public static void main(String[] args) throws Exception {
		String str = "E:\\ceshi\\yuanx0626";
		String str1 = "E:\\ceshi\\ce";
		CopyDirFile(str, str1);

	}

	public static void CopyDirFile(String str, String str1) throws Exception {
		File f1 = new File(str);
		File f2 = new File(str1);
		if (f1.isDirectory()) {
			f2.mkdirs();
			for (File temp : f1.listFiles()) {
				CopyDirFile(temp.getPath(), str1 + File.separator + temp.getName());
			}
		} else {
			if (f1.isFile()) {
				CopyFile(f1, f2);
			}
		}
	}

	public static void CopyFile(File src, File des) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));
		int len = 0;
		while ((len = bis.read()) != 0) {
			bos.write(len);
			bos.flush();
		}
		bos.close();
		bis.close();
	}
}
