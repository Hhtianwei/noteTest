package com.shsxt.jie;
//求出 1-100当中能被3整除或者能被5整除或者能被2整除的数  和， 
public class ORTest {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%5==0||i%3==0||i%2==0){
//				System.out.println(i);
				count++;
				sum = sum +i;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		
		
		//第二种  注意  求的是都满足的情况===>&&
		for(int i=1;i<=100;i++){
			if(i%5==0){
				if(i%3==0){
					if(i%2==0){
						System.out.println(i);
					}
				}
			}
	}
}
}
