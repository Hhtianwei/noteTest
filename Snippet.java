package com.shsxt.yuanx;

public class Snippet {
	public static void main(String[] args){		
			int i = 5;
			i++;
			System.out.println("i= " + i);// 6
			++i;
			System.out.println("i= " + i);// 7
			System.out.println("---------");
			int a = ++i;
			System.out.println("a= " + a);// 8
			System.out.println("i= " + i);//8
			int b = i++;
			System.out.println("b= " + b);// 8
			System.out.println("i= " + i);// 9
		}
	
}

