

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
	 * D:�������� :�����ڣ��������Ԫ�ص��±꣬�������ڣ�����-1
	 *		�����ҵ��ĵ�һ������������Ԫ��λ��
	 *		1,2,1,3  1
	 */
	public static int findNum (int[] arr , int a) {
		//���صı���
		int index = -1;//-1��ʾû�ҵ�
		for (int i=0; i<=arr.length-1; i++) {
			if(a == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/*1.��һ�����������е�0ȥ���󷵻�һ�������顣 
	���磺int[] arr={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};   
	Ҫ�󣺽����������е�0ȥ��������Ϊ0��ֵ����һ�������飬�����µ�������Ϊ����ֵ:
	 int[] newArr={1,13,45,5,16,6,25,4,17,6,7,15};
	 */
	public static int[] getNewArray (int[] arr) {
		//���������������ķ�0Ԫ�ظ���
		int count = 0;
		//ѭ������arr���飬ͳ�Ʒ�0Ԫ�صĸ�������Ϊ������ĳ���
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] != 0) {
				count++;
			}
		}
		//��count=0��˵��������û��0Ԫ��
		if(count == arr.length) {
			return arr;
		}else {
			//����������
			int[] newArr = new int[count];
			//newArr���±�
			int j = 0;
			for(int i=0; i<=arr.length-1; i++) {
				if(arr[i] != 0) {
					newArr[j] = arr[i];
					j++;//newArr�±�仯
				}
			}
			return newArr;
		}  
	}
	
	//2.��һ������˴�д��ĸ������ת���ɴ��Сд��ĸ�����鷵��
	public static char[] getCharacter(char[] ch) {
		for(int i=0; i<=ch.length-1; i++) {
			ch[i] = (char)(ch[i] +32);
		}
		return ch;
	}
	// ����ı���(int)
	 public static void printArr(int[] a){
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}
	    }
	 
	 // �ַ���(char)
	 public static void printArr(char[] a){
		for(int i=0;i<a.length;i++){
		    System.out.println(a[i]);
		}
	    }
	
}

