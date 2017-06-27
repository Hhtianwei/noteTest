package innerclass;

public class InnerClassTest {
	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Inner in = new Outter().new Inner();
		
		Outter1 out1 = new Outter1();
	//	Outter1.Inner1 in1 = new Outter1().new Inner1();
		Outter1.Inner1 in1 = out1.new Inner1();
		in1.test();
		
		
		
		
		Outter2 out2 = new Outter2();
		//Outter2.Inner2 in = new Outter2().new Inner2();
		out2.printOut();
		
		// 非静态内部类的创建方式， 不适用静态内部类的创建
		//Outter3.Inner3 in3 = new Outter3().new Inner3();
		
		Outter3.Inner3 in3_1 = new Outter3.Inner3();
	}
}

/*
 * 外部类
 * 内部类
 */
class Outter{
	class Inner{
		
	}
}


/*
 * 内部类和外部类成员变量的访问方式（了解）
 */

class Outter1{
	private int a = 10;
	class Inner1{
		private int a = 20;
		public void test(){
			int a = 30;
			System.out.println(a); // 内部类局部变量的访问方式
			System.out.println(this.a);// 内部类成员变量的访问方式
			System.out.println(Outter1.this.a); // 在内部类中访问外部类成员变量
		}
		
	}
}

/*
 * 内部类私有化
 */
class Outter2{
	private String name = "sxt";
	private int age = 12;
	
	private class Inner2{
		public void test(){
			System.out.println(age);
		}
	}
	
	public void printOut(){
		Inner2 in = new Inner2();
		in.test();
	}
}

/*
 * 静态内部类
 */

class Outter3{
	static class Inner3{
		
	}
}




