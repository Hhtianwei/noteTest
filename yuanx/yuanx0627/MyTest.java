package innerclass;

public class MyTest {
	public static void main(String[] args) {
		// 所有类的根基类， 类-》类型
//		Object obj = new Object();
		
		/*OutT out = new OutT();
		Object obj = out.makeInner();*/
		
		/*Object obj = new OutT().makeInner();
		System.out.println(obj.toString());*/
		
		System.out.println(new OutT().makeInner().toString());
		
	}
	
	// 方法头中规定返回值 类型
	public static Object test(){
		
		// return 的是真实的数据
		return new Object();
	}
}


class OutT{
	// 希望返回一个 Object类型的数据  或者 Object子类的数据（对象）
	public Object makeInner(){
		// 创建一个Object的子类
		/*class MyIn extends Object{
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "内部类对象";
			}
		}
		
		//Object obj = new Object();
		Object obj = new MyIn();*/
		
		/*Object obj = new Object(){
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "匿名内部类";
			}
		};
		
		return obj;*/
		
		// 匿名内部类匿名对象
		return new Object(){
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "匿名内部类";
			}
		};
	}
}






