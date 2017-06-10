public class test{
	public static void main(String[] args){
		int i = 1,j;	//j = 12;
		float f1 = 0.1;//需要加f或强制转换float f1 = 0.1f
		float f2 = 123;
		long l1 = 12345678,l2 = 8888888888;//l2必须加l，因为超出int范围l2 = 8888888888L
		double d1 = 2e20,d2 = 124;
		byte b1 = 1,b2 = 2,b3 = 129;//b3超出范围b3 = 127
		j = j+10;	//j没有初始化，先赋值
		i = i/10;	//值为0
		i = i*0.1;	//double类型，需强制转换i = (int)i*0.1;
		char c1 = 'a',c2 = 125;
		byte b = b1-b2;	//int类型，需强制转换byte b = (byte)b1-b2;
		char c = c1+c2-1;	//int类型，需强制转换char c = (char)c1+c2-1;
		float f3 = f1+f2;
		float f4 = f1+f2*0.1;	//double类型，需强制转换float f4 = (float)f1+f2*0.1;
		double d = d1*i+j;
		float f = (float)(d1*5+d2);
	}
}