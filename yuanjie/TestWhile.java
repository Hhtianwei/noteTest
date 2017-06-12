package com.shsxt.jie;
/*
 * while(boolean表达式){
 * 	为true时,执行
 * 
 * }
 * 为false时
 *  |
 *  |
 * \|/
 */
public class TestWhile {
	public static void main(String[] args) {
		//输出1~10
		int i=1;
		while(i<=10){
			System.out.println("i ="+i);
			i++;
		}
		
		//1~10 求和
		i=1;
		int sum=0;
		while(i<=10){
			sum+=i;
			i++;
		}
		System.out.println("sum="+sum);
		
		//1~10求和第二种
		i=10;
		sum=0;
		while(i>=1){
			sum+=i;
			--i;
		}
		System.out.println("sum="+sum);
		
		//打印1~100所有偶数
		i=1;
		while(i<=100){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
		
		//打印1~100所有偶数,5个一行
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
		
		
		// 1-50当中能被4整除的数的和
		i=1;
		sum=0;
		while(i<=50){
			if(i%4==0){
				System.out.println(i);
				sum+=i;
			}
			i++;
		}
		System.out.println("1-50当中能被4整除的数的和"+sum);
		
		
		// 求出 1-100当中能被3整除能被5整除或者能被2整除的和， 
		i=1;
		sum=0;
		while(i<=100){
			if(i%3==0||i%5==0||i%2==0){
				sum+=i;
			}
			i++;
		}
		System.out.println("1-100当中能被3整除能被5整除或者能被2整除的和"+sum);
		
		// 求出 1-100当中能被3整除能被5整除和能被2整除的和，
		i=1;
		sum=0;
		while(i<=100){
			if(i%3==0&&i%5==0&&i%2==0){
				sum+=i;
			}
			i++;
		}
		System.out.println("1-100当中能被3整除能被5整除且能被2整除的和"+sum);
		
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
		System.out.println("1-100当中能被3整除能被5整除且能被2整除的和"+sum);
		
		//5!
		int result=1;
		i=5;
		while(i>=1){
			result*=i;
			i--;
		}
		System.out.println("5的阶乘是"+result);
	}
}
