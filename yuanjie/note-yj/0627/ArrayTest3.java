package com.shsxt.array;

import java.util.Scanner;

/*
 *  定义一个长度为 10 的一维字符串数组，在每一个元素存放一个单词；然后运行时 从命令行输入一个单词，
 *  程序判断数组是否包含有这个单词，包含这个单词就打印出 “Yes”，不包含就打印出“No” 。 
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		String[] str = { "we", "today", "learn", "Exception", "inner", "and", "array", "and", "so", "all" };
		isInstanceof(str);
	}

	public static void isInstanceof(String[] str) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个单词：");
		String string = sc.nextLine();
		for (i = 0; i < str.length; i++) {
			if (string.equals(str[i])) {
				System.out.println("Yse");
				return;
			}
			continue;
		}
		System.out.println("No");
	}
}
