package com.shsxt.jie;
//请找出[1，200]之间能被3整除的所有数，每行输出5个数,每个数之间用逗号分隔
public class TestH01 {
	public static void main(String[] args) {
		int count=0;//用来计数
		for (int i = 1; i <= 200; i++) {
			if (i % 3 == 0) {
				if(count==0){//i为3时,第一个数的,不加
//					System.out.print(i);
				}else if(count<=5){
				//剩下的数,前面都有逗号,count不到5 不换行
//				System.out.print(" ,"+i);
				}
				count++;
				//count为5时换行
				if(count==5){
//					System.out.println();
					count=0;//又从0开始数了
				}
			}
		}
		test();
	}
	
	public static void test() {
		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 3 == 0) {
				if (count == 0) {
					System.out.print(i);
				} else if (count <= 5) {
					System.out.print("," + i);
				}
				count++;
				if (count == 5) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
















