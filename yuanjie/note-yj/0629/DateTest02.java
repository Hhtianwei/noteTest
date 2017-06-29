package com.shsxt.dateclass;

import java.util.Date;
/*
 * Date存储时间点
 * Date操作
 * 1、比较两个时间点是否是同一个时间点
 * 2、比较两个时间点的先后顺序
 * 3、判断前后
 */
public class DateTest02 {
	public static void main(String[] args){
		Date d1 =new Date();
		for(int i = 0;i < 10000;i ++){
			Date d = new Date();
		}
		Date d2 = new Date();
		System.out.println(d1.equals(d2));
		System.out.println("==========");
		
		d1 = new Date();
		d2 = new Date(d1.getTime()+10);
		System.out.println(d1.equals(d2));
		System.out.println(d1.before(d2));
		System.out.println(d1.after(d2));
		System.out.println(d1.compareTo(d2));
	}
}
