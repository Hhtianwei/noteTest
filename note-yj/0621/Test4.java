package com.shsxt.test;

public class Test4 {
	public static void main(String[] args) {
		int i = 0,sum = 0;
		while(i <= 10){
			sum += i;
			i++;
			if(i%2 == 0)
				continue;
		}
			System.out.println(sum);
	}
}
