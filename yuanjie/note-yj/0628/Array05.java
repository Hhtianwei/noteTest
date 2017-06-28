package com.shsxt.array;

/*
 * 数组：是引用类型
 * 1、判断两个数组是不是同一个数组
 * 2、判断两个数组是否是相同（相等） 的， 看数组的内容是否一致（数组的长度和对应位置的元素值）
 * 
 * 3、找出数组中的最大， 并且将最大值存放在第一个位置
 * 4、排序， 将数组里面的元素按一定的顺序进行排序（int）
 * 
 * 5、拷贝一份原有数组到另一个数组
 * 
 * 
 */
public class Array05 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = arr1;

		/*
		 * System.out.println(arr1==arr2); System.out.println(arr1==arr3);
		 * 
		 * // 判断arr1和arr2是否是相等的两个数组 System.out.println(myEqualseArr(arr1,arr2));
		 * 
		 * maxNum01(arr1); for(int temp : arr1){ System.out.print(temp + "\t");
		 * }
		 */

		mySort(arr1);
		for (int temp : arr1) {
			System.out.println(temp);
		}

		int[] a;
		a = copy1(arr1);

		int[] copy = new int[5];
		copy2(arr1, copy);

	}

	// 数组的拷贝
	// 你给空间我拷贝值
	public static void copy2(int[] arr, int[] copy) {
		// 取小的
		int minLen = Math.min(arr.length, copy.length);
		for (int i = 0; i < minLen; i++) {
			copy[i] = arr[i];
		}
	}

	// 数组的拷贝
	// 拷贝的同时开辟空间, 带有返回值的拷贝， 调用者不需要创建数组， 只需要一个数组类型的变量
	public static int[] copy1(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}

		return copy;
	}

	// 排序 降序
	/*
	 * 找出数组 当中最大的元素， 将该元素和第一个元素进行交换 找出数组当中除开第一个元素以外的最大值， 将该元素和第二元素交换位置
	 * 找出数组当中除开第一二个元素以外的最大值， 将该元素和第三给元素交换位置
	 * 
	 * 找出数组当中未排序元素的最大值， 将该元素和未排序的第一个元素交换位置
	 */

	public static void mySort(int[] arr) {
		// null
		int max = arr[0]; // 存放最大值
		int index = 0; // 最大值的下标

		// 找整个数组的最大值
		for (int i = 0; i < arr.length; i++) {
			max = arr[i]; // 存放最大值， 当前第一个就假定为最大值
			index = i; // 最大值下标， 假定当前第一个就是最大值

			// 找未排序的最大值， 从当前位置开始比较， 先和自己比 再和后面的比
			for (int j = i; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
					index = j;
				}
			}
			// 将找到的最大值和未排序的第一个进行交换
			/*
			 * arr[i]; // 未排序的第一个 i max; // 最大值 index; // 最大值的下标
			 */
			arr[index] = arr[i];
			arr[i] = max;

		}
	}

	public static void maxNum01(int[] arr) {
		int index = 0; // 保存最大值的下标 假设第一个是最大的
		int max = arr[0]; // max 保存的是最大值 假设第一个是最大
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}

		// 将最大值存入第一个为， 将第一个位置原来的值放入最大值的位置， 交换
		// 1、先将第一个位置的值存入 最大值的位置
		// 2、将最大值（临时空间）存入第一个位置
		arr[index] = arr[0];
		arr[0] = max;
	}

	/*
	 * 判断两个数组是否相等 1、长度 2、对应位置的元素 true false 不考虑空的情况
	 */
	public static boolean myEqualseArr(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		// 能到这里， 说明两个数组的长度是相等的
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		// 能走道这里， 说明，每个元素都相等， 即是两个相等的数组
		return true;
	}

}
