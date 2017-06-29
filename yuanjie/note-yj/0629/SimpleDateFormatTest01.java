package com.shsxt.dateclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		Date date = new Date();
		long Ldate = date.getTime();
		System.out.println(Ldate);
		System.out.println("================");

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// 将指定日期，按照我工具对象指定的格式转换成字符串
		String dateStr = df.format(date);
		System.out.println(dateStr);
		System.out.println("================");

		// 字符串-》日期 2010-2-2 0：0：0
		Date d1 = new Date();
		String str = "2010-2-2 0:0:0";
		String str1 = "2010-2-2 0：0：0";
		try {
			// d1 = df.parse(str);
			d1 = df.parse(str1);
			System.out.println(d1);
		} catch (ParseException e) {
			// e.printStackTrace();
			System.out.println("日期字符串格式不正确");
		}
	}
}
