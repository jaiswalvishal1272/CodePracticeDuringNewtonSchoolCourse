import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 8, 15, 2, 3, 9, 10, 25 };
        System.out.println(arr.length - 1);
        // System.out.println(Arrays.toString(subArray(arr, 0, arr.length - 1)));
        subArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void subArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
            subArray(arr, start, mid);
            subArray(arr, mid+1, end);
            mregeArray(arr, start, mid, mid + 1, end);
        // return arr;
    }
    public static void mregeArray(int[] arr, int start1, int end1, int start2, int end2) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        int j = start1, k = start2, i = 0;
        int[] arrNew = new int[len1 + len2];
        while (j < end1 && k < end2) {
            if(arr[j] < arr[k]){
                arrNew[i] = arr[j];
                j++;
            }
            else {
                arrNew[i] = arr[k];
                k++;
            }
            i++;
        }
        while (j < end1) {
            arrNew[i] = arr[j];
            j++;
            i++;
        }
        while (k < end2) {
            arrNew[i] = arr[k];
            k++;
            i++;
        }
        for(int l = start1; l <= end2; l++) {
            arr[l] = arrNew[l-start1];
        }
        // return arr;
    }
}
