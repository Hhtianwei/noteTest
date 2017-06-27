package innerclass;

public class InnerClassTest3 {

	public static void main(String[] args) {
		// 1、Test不能new 接口   2、Test对象中的test方法想要完成什么功能由你来定
		test(new MyTest(){
			@Override
			public void test() {
				System.out.println("想怎么实现就这么实现");
			}
		});
	}
	
	public static void test(MyTest obj){
		obj.test();
	}
}


interface Test{
	void test();
}




