package com.shsxt.array;

/*
 * 数组：是引用类型
 * 1、判断两个数组是不是同一个数组
 * 2、判断两个数组是否是相同（相等） 的， 看数组的内容是否一致（数组的长度和对应位置的元素值）
 * 
 * 3、找出数组中的最大， 并且将最大值存放在第一个位置
 * 4、排序， 将数组里面的元素按一定的顺序进行排序（int）
 * 
 * 5、拷贝一份原有数组到另一个数组
 * 
 */
public class Array04 {
	public static void main(String[] args) {
		
	}
	
	public static boolean same(int[] a,int[] b){
		if(a.length != b.length){
			return false;
		}
		for(int i = 0;i <a.length;i++){
			if(a[i] != b[i]){
				return false;
			}
		}
		return true;
	}
}
