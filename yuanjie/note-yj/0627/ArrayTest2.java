package com.shsxt.array;
// 完成10-20的平方，并将结果保存在一个数组中 
public class ArrayTest2 {
	public static void main(String[] args) {
		int[] aa = new int[10];
		int j = 10;
		for(int i = 0;i<10;i++){
			System.out.println("aa["+i+"]="+j*j++);
		}
	}
}
