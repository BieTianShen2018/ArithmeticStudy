package algorithm;

import java.time.format.TextStyle;
import java.util.Arrays;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test={6,3,88,34,19,1,56,2,77,55};
		//basicSelectSortValue(test);
		basicSelectSortIndex(test);
		System.out.println(Arrays.toString(test));

	}
	public  static void basicSelectSortValue(int[] test){
			for(int i=0;i<test.length;i++){
				int samllest=test[i];
				int index=i;
				for(int j=i;j<test.length-1;j++){
					if(samllest> test[j+1]){
						samllest=test[j+1];
						index=j+1;
					}
				}
				test[index]=test[i];
				test[i]=samllest;
				
			}			
	 }
	
	public static int[] basicSelectSortIndex(int[] sourceArray)  {
		         int[] arr = sourceArray;		 
		         // �ܹ�Ҫ���� N-1 �ֱȽ�
		        for (int i = 0; i < arr.length - 1; i++) {
		            int min = i;
		
		            // ÿ����Ҫ�ȽϵĴ��� N-i
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[j] < arr[min]) {
		                    // ��¼Ŀǰ���ҵ�����СֵԪ�ص��±�
		                    min = j;
		               }
		          }	
		            // ���ҵ�����Сֵ��iλ�����ڵ�ֵ���н���
		            if (i != min) {
		                int tmp = arr[i];
		                arr[i] = arr[min];
		                arr[min] = tmp;
		            }		
		        }
		        return arr;
		    }	
}
