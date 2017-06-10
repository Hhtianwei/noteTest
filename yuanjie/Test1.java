public class Test1{
//输出1—100内前5个可以被3整除的数
	public static void main(String[] args){
		int num = 0;
		for(int i = 1;i <= 100;i++){
			if(i%3==0){
				System.out.println(i+" ");
				num++;
			}
			if(num==5){
				break;
			}
		}
	}
}
