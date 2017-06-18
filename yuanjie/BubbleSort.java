package lesson3;

public class BubbleSort
{
	public static void main(String[] args)
	{	int [ ] arr = {1,2,3,4,5,6,1,-1,33,-10};
		bubbleSort(arr);
		print(arr);
	}
	// 冒泡排序
	static void bubbleSort(int[] arr)
	{
		for (int count = 1; count < arr.length; count++) {//角标0的时候不用比所以是1
			for (int index = 0; index < arr.length - count; index++) {//每次比较的元素少一个-count
				// 前一个元素大于后一个元素
				if (arr[index] > arr[index + 1]) {
					int temp = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = temp;
				}
			}
		}
	}
	static void print(int[] arr)//打印数组放方法
	{
		String str = "[";
		for(int i =0;i < arr.length;i++)
		{
			str = str + arr[i];
			if(i != arr.length-1)//不是最后一个元素
			{
			   str = str +", ";
			}
		}
		str = str +"]";
		System.out.println(str);
	}
}
