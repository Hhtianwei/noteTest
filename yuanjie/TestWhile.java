package com.shsxt.jie;
/*
 * while(boolean���ʽ){
 * 	Ϊtrueʱ,ִ��
 * 
 * }
 * Ϊfalseʱ
 *  |
 *  |
 * \|/
 */
public class TestWhile {
	public static void main(String[] args) {
		//���1~10
		int i=1;
		while(i<=10){
			System.out.println("i ="+i);
			i++;
		}
		
		//1~10 ���
		i=1;
		int sum=0;
		while(i<=10){
			sum+=i;
			i++;
		}
		System.out.println("sum="+sum);
		
		//1~10��͵ڶ���
		i=10;
		sum=0;
		while(i>=1){
			sum+=i;
			--i;
		}
		System.out.println("sum="+sum);
		
		//��ӡ1~100����ż��
		i=1;
		while(i<=100){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
		
		//��ӡ1~100����ż��,5��һ��
		i=1;
		while(i<=100){
			if(i%2==0){
				System.out.print(i+"\t");
			}
			i++;
			if(i%10==0){
				System.out.println();
			}
		}
		
		
		// 1-50�����ܱ�4���������ĺ�
		i=1;
		sum=0;
		while(i<=50){
			if(i%4==0){
				System.out.println(i);
				sum+=i;
			}
			i++;
		}
		System.out.println("1-50�����ܱ�4���������ĺ�"+sum);
		
		
		// ��� 1-100�����ܱ�3�����ܱ�5���������ܱ�2�����ĺͣ� 
		i=1;
		sum=0;
		while(i<=100){
			if(i%3==0||i%5==0||i%2==0){
				sum+=i;
			}
			i++;
		}
		System.out.println("1-100�����ܱ�3�����ܱ�5���������ܱ�2�����ĺ�"+sum);
		
		// ��� 1-100�����ܱ�3�����ܱ�5�������ܱ�2�����ĺͣ�
		i=1;
		sum=0;
		while(i<=100){
			if(i%3==0&&i%5==0&&i%2==0){
				sum+=i;
			}
			i++;
		}
		System.out.println("1-100�����ܱ�3�����ܱ�5�������ܱ�2�����ĺ�"+sum);
		
		//
		i=1;
		sum=0;
		while(i<=100){
			if(i%3==0){
				if(i%5==0){
					if(i%2==0){
						//1
						sum+=i;
					}
				}
				
			}
			i++;
		}
		System.out.println("1-100�����ܱ�3�����ܱ�5�������ܱ�2�����ĺ�"+sum);
		
		//5!
		int result=1;
		i=5;
		while(i>=1){
			result*=i;
			i--;
		}
		System.out.println("5�Ľ׳���"+result);
	}
}
