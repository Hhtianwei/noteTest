package com.shsxt.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collection03 {
	public static void main(String[] args){
		Collection<String> names = new ArrayList<String>();
		System.out.println(names.isEmpty());
		names.add("zs");
		names.add("ls");
		names.add("ww");
		//统计人数
		System.out.println(names.size());
		
		// 查看某个人（元素）来了没有
		System.out.println("有没有zl："+names.contains("zl"));
		names.add("zl");
		System.out.println("有没有zl："+names.contains("zl"));
		// 查看此时是否已经有人来了
		System.out.println("是否为空："+names.isEmpty());
		
		Collection<String> col = new ArrayList<String>();
		col.add("如花");
		col.add("赵四");
		col.add("刘能");
		// 比较两个容器内容是否相同
		System.out.println(names.equals(col));
		System.out.println("============");
		System.out.println(names.remove("zl"));
		System.out.println(names.contains("zl"));
		// 当一个元素本来就没在容器中时， 移除不成功
		System.out.println(names.remove("如花"));
		
		System.out.println("===================");
		// 清空容器，  只是将班里的人全都撤走， 班级任然存在
		col.clear();
		System.out.println(col.size());
		System.out.println(col.contains("如花"));
		System.out.println(col.isEmpty());
		System.out.println("=====================");
		
		// 程老师来拿名单
		Object[] nameStr = names.toArray();
		System.out.println(Arrays.toString(nameStr));
		// 又来了一个人
		names.add("刘亦菲");
		// 程老师的名单
		System.out.println(Arrays.toString(nameStr));
		System.out.println(names.size());

		String[] namesStr = new String[10];
		names.toArray(namesStr);
		System.out.println(Arrays.toString(namesStr));
		
		col.add("zs");
		col.add("ls");
		//col.add("周杰伦");
		System.out.println("=====================");
		boolean flag = col.retainAll(names); // 留下两个容器相同的内容， 在 col中， 返回一个boolean值，代表 col是否被修改
		System.out.println(names); //  能直接显示容器中元素内容
		System.out.println(col);
		System.out.println(flag);
		
	}
}
