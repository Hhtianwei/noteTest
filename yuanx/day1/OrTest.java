package com.shsxt.yx;

//��� 1-100�����ܱ�3���������ܱ�5���������ܱ�2��������  ��
public class OrTest {

	public static void main(String[] args) {

		int[] arr = new int[100];
		int index = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				arr[index++] = i;
				continue;
			}
			if (i % 5 == 0) {
				arr[index++] = i;
				continue;
			}
			if (i % 2 == 0) {
				arr[index++] = i;
				continue;
			}
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
