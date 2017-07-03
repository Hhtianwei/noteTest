package innerclass;

public class InnerClassTest2 {
	public static void main(String[] args) {
		Outter5 out = new Outter5();
		System.out.println(out.makeInner("你好"));
	}
}


class Outter5{
	// Object
	public Object makeInner(final String str){
		return new Object(){
			private String a = "abc";
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "lalaal " + a + str;
			}
		};
	}
}


