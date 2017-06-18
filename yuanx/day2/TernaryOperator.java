package com.shsht.yuanx;

public class TernaryOperator {
/*	现在给一个小数，需要求出其四舍五入之后的结果，怎么完成该功能？
	思路：取得整数部分，再取得小数部分，再判断小数部分和0.5的大小关系，若大于等于，结
	果就是整数部分加1，否则就是整数部分。
	三元运算符，表示有三个元素参与的表达式，所以又称为三目运算符，其语义表示if-else*/
	public static void main(String[] args){
		double num;
		num=8.56;
		int iNum=(int)num;
		double dNum=num-iNum;
		int ret=dNum>=0.5?iNum+1:iNum;
		System.out.println(ret);
	//奇偶数
		int x1; 
		x1=101;
		String ret2=x1%2==0?"偶数":"奇数";
		System.out.println(ret2);
	}


}
