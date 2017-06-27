package com.shsht.yuanx;

/*
 * 五、逻辑运算符
 * |或：只要有一个为true,结果即为true;全部为false,结果为false
 * &与:只要有一个为false,结果即为fasle;全部为true,结果才为true
 * ^异或:不同为true,相同为false
 * !非:若为true,非之后 为false;若为false,非之后为true  取反
 * &&短路与:若能判定结果为false时，则后面全部不进行判定
 * ||短路或:若能判定结果为true时，则后面全部不进行判定
 * 
 * 优先级：! & | && ||
 * 逻辑运算符内部优先级：非、与、或
 *
 * 所有运算符的优先级：单目乘除位关系、逻辑三目后赋值
 */
public class Logic {
	public static void main(String[] args) {
		int a = 10;
		/*
		 * //逻辑或 System.out.println(4>3 | a++>2);//true | true
		 * System.out.println(2>4 | a <2); //false | false
		 * System.out.println("a="+a);//a=11 //短路或 System.out.println(4>3 ||
		 * a++>2);// true || System.out.println("a="+a);//a=11
		 */

		// 逻辑与
		/*
		 * System.out.println( 4 > 3 & a++>5);//true & false
		 * System.out.println(4> 3 & 2<5);//true & true
		 * System.out.println("a="+a); System.out.println(4 > 3 && a++>5);//true
		 * System.out.println("a="+a); System.out.println(3> 4 && a++>5);//false
		 * System.out.println("a="+a);
		 */

		/*
		 * //异或 System.out.println(4 > 3 ^ 3>4); System.out.println(4> 3 ^ 4>2);
		 * 
		 * //非 System.out.println(!true); System.out.println(!false);
		 */

		// 混合：非、与、或
		System.out.println("=========================");
		// System.out.println(!false && true || true);//true

		// System.out.println(!false || true && false);//true

		// System.out.println(!false || 4/0>0 && false);

		/*
		 * System.out.println(a++>30 || a<20 && 10>a || !true);//false || false
		 * || false System.out.println("a="+a);//a=11
		 */
		
		System.out.println(!false || a++ > 10 && a++ > 10);  //短路
		System.out.println("a=" + a);

		System.out.println(!true || a++ < 10 && a++ > 10);// false || false &&
															// 无所谓
		System.out.println("a=" + a);

		System.out.println(!true || a++ == 10 && a++ > 10);// false || true
															// &&true
		System.out.println("a=" + a);

		boolean flag = ++a * 4 > 4 && a++ > 10 ? a == 3 : a < 3;
		System.out.println(flag);

		System.out.println(!false | (a++ < 10 && a++ > 0));
		System.out.println("a=" + a);

		/*
		 * System.out.println(!false & (a++>10 && a++<4));
		 * System.out.println("a="+a);
		 */

	}
}
