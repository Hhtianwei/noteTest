package com.shsxt.yuanx;

import java.util.*;

public class Collection_List01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(49);
		list.add(23);
		list.add(35);
		list.add(20);
		list.add(6);
		for (Integer temp : list) {
			System.out.println(temp);

		}
		int i = list.get(4);
		System.out.println(i);
		int index = list.indexOf(20);
		
		System.out.println(index);
	}

	
	}


