package com.shsxt.jie;
//���ҳ�[1��200]֮���ܱ�3��������������ÿ�����5����,ÿ����֮���ö��ŷָ�
public class TestH01 {
	public static void main(String[] args) {
		int count=0;//��������
		for (int i = 1; i <= 200; i++) {
			if (i % 3 == 0) {
				if(count==0){//iΪ3ʱ,��һ������,����
//					System.out.print(i);
				}else if(count<=5){
				//ʣ�µ���,ǰ�涼�ж���,count����5 ������
//				System.out.print(" ,"+i);
				}
				count++;
				//countΪ5ʱ����
				if(count==5){
//					System.out.println();
					count=0;//�ִ�0��ʼ����
				}
			}
		}
		test();
	}
	
	public static void test() {
		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 3 == 0) {
				if (count == 0) {
					System.out.print(i);
				} else if (count <= 5) {
					System.out.print("," + i);
				}
				count++;
				if (count == 5) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
















