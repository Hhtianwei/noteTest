package com.shsxt.jie;
/*
 * 	do {
				ѭ�������;
			}while(�ж��������);
			
			��չ��ʽ��
			��ʼ�����;
			do {
				ѭ�������;
				�����������;
			}while(�ж��������);
			

 */
public class TestDoWhile {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;//��������
		}while (i<1);
		
		while (i < 1){
			System.out.println(i);
			i++;
		}
	}
}
