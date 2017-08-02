package com.shsxt.array;
//将 1-20存放到对应的数组中，求和 
public class ArrayTest4 {
	public static void main(String[] args) {
		int[] arrInt = new int[20];
		System.out.println("sum="+add(arrInt,20));
	}
	
	public static int add(int[] arrInt,int n){
		int sum = 0;
		for(int i = 0;i < arrInt.length;i++){
			System.out.println("arrInt["+i+"]="+(i+1));
			sum += i;
		}
		return sum;
	}
}
