package com.shsxt.yuanx1;

import java.util.*;

/*
签到表的模拟
1、有一张名单表
2、来一个人签一个名字， 只能是 我名单表中有的人才能签名
3、来人的签名需要有顺序
4、同一个人不能签到两次（不能重复签到，这张名单上的人不能重复）
5、最后统计哪些人没来
6、签到结束的条件：只有5次签到机会，当5次签到机会使用完，签到结束； 当控制台输入over的时候结束签到
7、签到结束以后，显示该来的并且来了的人名单， 该来的而没有来的人的名单*/
public class Collection_test01 {
	public static void main(String[] args) {
		Collection<String> names = new HashSet<String>();
		names.add("小花");
		names.add("小白");
		names.add("小刘");
		names.add("小王");
		names.add("小黑");
		System.out.println(names);// 名单表
		Collection<String> names1 = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if ("over".equals(str)) {
				break;
			}
			if (names.contains(str)) {
				if (!names1.contains(str)) {
					names1.add(str);
				}

			}
		}
		System.out.println("该来的来了");
		for (String temp : names1) {
			System.out.println(temp);
		}
		System.out.println("该来的没来");
		for (String temp : names) {
			if (!names1.contains(temp)) {
				System.out.println(temp);
			}
		}

		System.out.println();
	}
}