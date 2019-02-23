package algorithm;

import java.time.format.TextStyle;
import java.util.Arrays;

/**
 * Created by chengxiao on 2016/12/14.
 * ��������
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {78, 8, 0, 6, 5, 55, 3, 2, 1, 7};
        sortFor(arr);
        System.out.println("��������" + Arrays.toString(arr));
    }

    public void MyQuickSort(int[] test) {
	  int start=0,end=test.length;
	  int temp=test[start];
	  for (int i = 0; i < test.length; i++) {
		
	}
	}
    
    public static void sortFor(int[] sourceArray)  {
        // �� arr ���п��������ı��������
        int[] arr = sourceArray;
        quickSortFor(arr, 0, arr.length - 1);
    }

    private static int[] quickSortFor(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSortFor(arr, left, partitionIndex - 1);
            quickSortFor(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        // �趨��׼ֵ��pivot��
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }
    
    /**
     * @param arr
     * @param left  ��ָ��
     * @param right ��ָ��
     */
    public static void quickSortWhile(int[] arr, int left, int right) {
        if (left < right) {
            //��ȡ��Ŧֵ����������ڵ�ǰ����������ĩβ
            dealPivot(arr, left, right);
            //��Ŧֵ����������ĩβ
            int pivot = right - 1;
            //��ָ��
            int i = left;
            //��ָ��
            int j = right - 1;
            while (true) {
                while (arr[++i] < arr[pivot]) {
                }
                while (j > left && arr[--j] > arr[pivot]) {
                }
                if (i < j) {
                    swap(arr, i, j);
                } else {
                    break;
                }
            }
            if (i < right) {
                swap(arr, i, right - 1);
            }
            quickSortWhile(arr, left, i - 1);
            quickSortWhile(arr, i + 1, right);
        }

    }

    /**
     * ������Ŧֵ
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void dealPivot(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[left] > arr[mid]) {
            swap(arr, left, mid);
        }
        if (arr[left] > arr[right]) {
            swap(arr, left, right);
        }
        if (arr[right] < arr[mid]) {
            swap(arr, right, mid);
        }
        swap(arr, right - 1, mid);
    }

    /**
     * ����Ԫ��ͨ�ô���
     *
     * @param arr
     * @param a
     * @param b
     */
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}