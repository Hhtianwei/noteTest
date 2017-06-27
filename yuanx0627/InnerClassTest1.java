package innerclass;

public class InnerClassTest1 {
	public static void main(String[] args) {
		Outter4 out = new Outter4();
		out.print(4);
	}
}

/*
 *局部内部类：定义在方法内部的类
 *	在方法内部定义类和实例化对象一步完成， 创建一个匿名局部内部类对象， 并且该对象（类）继承自某一个类|接口的
 */
class Outter4{
	public void print(int x){
		/*class Inner4 extends Object{
			public void test(){
				System.out.println("inner4");
			}
		}
		
		Inner4 in = new Inner4();
		in.test();
		System.out.println("abc");*/
		
		// 完整写法
		/*class Inner4 extends Object{
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "我是Object的匿名子类";
			}
		}*/
		// 为了方便， 我们可以简写为如下格式
		
		/*Object obj = new Object(){
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "我是Object的匿名子类";
			}
		};
		System.out.println(obj.toString());*/
	
		
		// 再次简写
		System.out.println(new Object(){
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "我是Object的匿名子类";
			}
		}.toString());
		
	}
}