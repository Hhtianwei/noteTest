package com.shsxt.jie;
//��� 1-100�����ܱ�3���������ܱ�5���������ܱ�2��������  �ͣ� 
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
		
		
		//�ڶ���  ע��  ����Ƕ���������===>&&
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
