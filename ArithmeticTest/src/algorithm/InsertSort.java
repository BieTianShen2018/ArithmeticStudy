package algorithm;

import java.time.format.TextStyle;
import java.util.Arrays;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test={6,3,88,34,19,1,56,2,77,55};
		//basicSelectSortValue(test);
		basicInsertSortWhile(test);
		System.out.println(Arrays.toString(test));

	}
	public  static void basicInsertSort(int[] test){
			for(int i=0;i<test.length;i++){
				int temp=test[i];
				int index=i;
				for(int j=i-1;j>=0;j--){
					if(temp<test[j]){
						test[j+1]=test[j];
						index=j;
					}
				}
				if(index!=i){
					test[index]=temp;
				}
				
			}			
	 }
	
    public static void basicInsertSortWhile(int[] sourceArray)   {
        // �� arr ���п��������ı��������
        int[] arr = sourceArray;

        // ���±�Ϊ1��Ԫ�ؿ�ʼѡ����ʵ�λ�ò��룬��Ϊ�±�Ϊ0��ֻ��һ��Ԫ�أ�Ĭ���������
        for (int i = 1; i < arr.length; i++) {

            // ��¼Ҫ���������
            int tmp = arr[i];

            // ���Ѿ�������������ұߵĿ�ʼ�Ƚϣ��ҵ�����С����
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // ���ڱ���С����������
            if (j != i) {
                arr[j] = tmp;
            }

        }
    }
}
		

