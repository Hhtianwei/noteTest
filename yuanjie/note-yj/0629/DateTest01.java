package com.shsxt.dateclass;

import java.util.Date;

/* Date 存在于 java.util包下
 * Date： 用来存储时间
 * 构造方式：   不带参的构造方法， 表示里面存储当前时间点； 也可以给定一个long数据， 存储的是1970-1-1 0:0:0:0   过后long时间的时间点
 */
public class DateTest01 {
	public static void main(String[] args){
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime()+60*60*1000);
		
		System.out.println(d1.toString());
		/*long num = d1.getTime(); // 返回当前对象中存储的时间距离特定时间时间点的毫秒数
		System.out.println(num);
		*/
		System.out.println(d2.toString());
	}
}
