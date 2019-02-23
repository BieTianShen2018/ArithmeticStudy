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
	
	// Java ����ʵ��
	    public static void basicBubbleSortFlag(int[] sourceArray)  {
	        // �� arr ���п��������ı��������
	        int[] arr = sourceArray;
	        for (int i = 1; i < arr.length; i++) {
	            // �趨һ����ǣ���Ϊtrue�����ʾ�˴�ѭ��û�н��н�����Ҳ���Ǵ��������Ѿ����������Ѿ���ɡ�
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

