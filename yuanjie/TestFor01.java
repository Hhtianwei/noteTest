package com.shsxt.jie;
/*
 * for(��ʼ��;�ж�����;����){
 * 		ѭ����===>Ҫִ�е����
 * }
 */
public class TestFor01 {
	public static void main(String[] args) {
		
		/*System.out.print("�Ҳ�����");
		System.out.println("�һỻ��");
*/	
		
		//��helloworld��ӡʮ��
		for(int i=0;i<=9;i++){
			System.out.println("helloworld");
		}
		
		//1~10 ���
		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("�����:"+sum);
		
		
		//��ӡ10~1
		for(int i=10;i>0;i--){
			System.out.println(i);
		}
		
		//��ӡ1~100������ż��  
		int count=0;
		for(int i=1;i<=100;i++){
			//��2ȡ��Ϊ��===>ż��
			if(i%2==0){
				System.out.print(i+" ");
				count++;// 1
			if(count%5==0){
				System.out.println();
				}	
			}
		}
		
		//e:��1-100��ż����, ��һ��   ��  
		sum=0;
		for(int i=1;i<=100;i++){
			//���ż��
			if(i%2==0){
				//System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("1-100��ż����:"+sum);
		
		//e:��1-100��ż����,  �ڶ���
		sum=0;
		for(int i=0;i<=100;i=i+2){
			//ֱ������ľ���ż��
			// System.out.println(i);
			sum = sum + i;
		}
		System.out.println("1-100��ż����:"+sum);
	
		
		//1-50�����ܱ�3���������ĺ�    (����λ���ĺ������3�ı���)
		int add=0;
		for(int i=1;i<=50;i++){
			if(i%3==0){
				//System.out.println(i);
				add+=i;
			}
		}
		System.out.println("1-50�����ܱ�3���������ĺ���"+add);
		
		// ��� 1-100�����ܱ�3���������ܱ�5���������ܱ�2�����ĺͣ� 
		add=0;
		for(int i=1;i<=20;i++){
			if(i%5==0||i%3==0||i%2==0){
				System.out.println(i);
			}
		}
		
		
		
	}
}
