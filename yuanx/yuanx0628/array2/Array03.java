package com.shsxt.array2;

import java.util.Arrays;

public class Array03 {
	public static void main(String[] args) {
		Person[] p1 = { new Person("zs", 2), new Person("ls", 1) };
		Arrays.sort(p1);
		System.out.println(Arrays.toString(p1));
	}

}
