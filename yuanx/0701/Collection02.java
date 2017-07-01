package com.shsxt.yuanx1;

import java.util.*;

public class Collection02 {
	public static void main(String[] args) {

		// 定好的名单
		List<String> names = new ArrayList<String>();
		names.add("张学友");
		names.add("彭于晏");
		names.add("梁家辉");
		names.add("懂海宇");
		names.add("董卿");
		// 以上人员，有资格签到的

		// 准备的名单， 来者签名
		List<String> comName = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("来者何人：");
			String temp = sc.nextLine();// 获取来人的姓名
			// 签到结束的条件（另一个条件）
			if ("over".equals(temp)) {
				break;
			}

			if (names.contains(temp)) { // 你是在预约名单上的人， 才能签名
				// 再次判断， 判断此人是否已经签到过了， 如果已经签过了，就不再重复签到， 如果没签到过， 才签到
				if (!comName.contains(temp)) {
					comName.add(temp);
				}
			}

		}

		// 至此， 签到已完成
		// 1、该来的并且也来了的
		System.out.println("以下是该来的：而且出席了的人名单");
		for (String name : comName) {
			System.out.println(name);
		}

		System.out.println("以下是该来的但是没来的，下次就不请了");

		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String temp = it.next();
			if (!comName.contains(temp)) {
				System.out.println(temp);
			}
		}

	}
}
