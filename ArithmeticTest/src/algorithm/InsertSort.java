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
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = sourceArray;

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {

            // 记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

        }
    }
}
		

