import java.util.*;
public class SelectionSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            position(arr, i);
        }
    }
    public static void position(int[] arr, int pivotIdx) {
        int minElemIdx = minEleIdx(arr, pivotIdx, arr.length - 1);
        swap(arr, pivotIdx, minElemIdx);
    }
    private static int minEleIdx(int[] arr, int startIdx, int endIdx) {
        int minElemIdx = startIdx;
        for(int i = startIdx; i <= endIdx; i++) {
            if(arr[i] < arr[minElemIdx]) {
                minElemIdx = i;
            }
        }
        return minElemIdx;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = new int[] {1, 5, 3, 2, 4};
        obj.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
