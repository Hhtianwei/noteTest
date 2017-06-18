

public class Day06Test {
    public static void main(String[] args) {
	int[] arr1={13,23,24,55,3,2};
	
	int a=findNum(arr1,2);
	System.out.println(a);
	System.out.println("===========================");
	int[] arr2={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};
	int[] arr4=getNewArray(arr2);
	//System.out.println(arr4);
	printArr(arr4);
	System.out.println("===========================");
	char[] arr3={'A','B'};
	char[] arr5=getCharacter(arr3);
	printArr(arr5);
	
    }
    /*
	 * D:基本查找 :若存在，返回这个元素的下标，若不存在，返回-1
	 *		返回找到的第一个符合条件的元素位置
	 *		1,2,1,3  1
	 */
	public static int findNum (int[] arr , int a) {
		//返回的变量
		int index = -1;//-1表示没找到
		for (int i=0; i<=arr.length-1; i++) {
			if(a == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/*1.将一个整型数组中的0去掉后返回一个新数组。 
	例如：int[] arr={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};   
	要求：将以上数组中的0去掉，将不为0的值存入一个新数组，生成新的数组作为返回值:
	 int[] newArr={1,13,45,5,16,6,25,4,17,6,7,15};
	 */
	public static int[] getNewArray (int[] arr) {
		//计数器，存放数组的非0元素个数
		int count = 0;
		//循环遍历arr数组，统计非0元素的个数，作为新数组的长度
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] != 0) {
				count++;
			}
		}
		//若count=0，说明数组中没有0元素
		if(count == arr.length) {
			return arr;
		}else {
			//创建新数组
			int[] newArr = new int[count];
			//newArr的下标
			int j = 0;
			for(int i=0; i<=arr.length-1; i++) {
				if(arr[i] != 0) {
					newArr[j] = arr[i];
					j++;//newArr下标变化
				}
			}
			return newArr;
		}  
	}
	
	//2.将一个存放了大写字母的数组转换成存放小写字母的数组返回
	public static char[] getCharacter(char[] ch) {
		for(int i=0; i<=ch.length-1; i++) {
			ch[i] = (char)(ch[i] +32);
		}
		return ch;
	}
	// 数组的遍历(int)
	 public static void printArr(int[] a){
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}
	    }
	 
	 // 字符型(char)
	 public static void printArr(char[] a){
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}
	    }
	
}

