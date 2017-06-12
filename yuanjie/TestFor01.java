package com.shsxt.jie;
/*
 * for(初始化;判断条件;迭代){
 * 		循环体===>要执行的语句
 * }
 */
public class TestFor01 {
	public static void main(String[] args) {
		
		/*System.out.print("我不换行");
		System.out.println("我会换行");
*/	
		
		//把helloworld打印十次
		for(int i=0;i<=9;i++){
			System.out.println("helloworld");
		}
		
		//1~10 求和
		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("结果是:"+sum);
		
		
		//打印10~1
		for(int i=10;i>0;i--){
			System.out.println(i);
		}
		
		//打印1~100的所有偶数  
		int count=0;
		for(int i=1;i<=100;i++){
			//对2取余为零===>偶数
			if(i%2==0){
				System.out.print(i+" ");
				count++;// 1
			if(count%5==0){
				System.out.println();
				}	
			}
		}
		
		//e:求1-100的偶数和, 第一种   ，  
		sum=0;
		for(int i=1;i<=100;i++){
			//求出偶数
			if(i%2==0){
				//System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("1-100的偶数和:"+sum);
		
		//e:求1-100的偶数和,  第二种
		sum=0;
		for(int i=0;i<=100;i=i+2){
			//直接输出的就是偶数
			// System.out.println(i);
			sum = sum + i;
		}
		System.out.println("1-100的偶数和:"+sum);
	
		
		//1-50当中能被3整除的数的和    (所有位数的和相加是3的倍数)
		int add=0;
		for(int i=1;i<=50;i++){
			if(i%3==0){
				//System.out.println(i);
				add+=i;
			}
		}
		System.out.println("1-50当中能被3整除的数的和是"+add);
		
		// 求出 1-100当中能被3整除或者能被5整除或者能被2整除的和， 
		add=0;
		for(int i=1;i<=20;i++){
			if(i%5==0||i%3==0||i%2==0){
				System.out.println(i);
			}
		}
		
		
		
	}
}
