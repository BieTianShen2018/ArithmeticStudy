package algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test={3,6,88,34,19,11,5};
		//basicBubbleSort(test);
		basicBubbleSortFlag(test);
		System.out.println(Arrays.toString(test));

	}
	public  static void basicBubbleSort(int[] test){
			for(int i=0;i<test.length;i++){
				for(int j=1;j<test.length;j++){
					if(test[j-1]> test[j]){
						test[j-1]=test[j-1]+test[j];
						test[j]=test[j-1]-test[j];
						test[j-1]=test[j-1]-test[j];
					}
				}
			}
			
	 }
	
	// Java 代码实现
	    public static void basicBubbleSortFlag(int[] sourceArray)  {
	        // 对 arr 进行拷贝，不改变参数内容
	        int[] arr = sourceArray;
	        for (int i = 1; i < arr.length; i++) {
	            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
	            boolean flag = true;

	            for (int j = 0; j < arr.length - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int tmp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = tmp;

	                    flag = false;
	                }
	            }

	            if (flag) {
	                break;
	            }
	        }
	    }
	}

