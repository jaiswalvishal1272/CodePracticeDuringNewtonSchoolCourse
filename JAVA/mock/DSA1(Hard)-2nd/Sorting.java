import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1, 0, 0, 2, 2};
        sort(arr, 0, arr.length - 1);

    }
    public static void sort(int[] arr, int start, int end) {
        
        if(start< end) {
            int mid = start + (end - start) / 2;
            sort(arr, start, mid);
            sort(arr, mid+1, end);
            merge(arr, start, mid, mid+1, end);
        }
    }
    public static void merge( int[] arr, int start1, int end1, int start2, int end2) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        int i = start1, j= start2, k = 0;
        int[] temp = new int[len1 + len2];
        while(i <= end1 && j <= end2) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;

            }
            k++;

        }
        while(i <= end1) {
            temp[k] = arr[i];
            i++;
            k++;

        }
        while(j <= end2) {
            temp[k] = arr[j];
            j++;
            k++;

        }
        System.out.println(Arrays.toString(temp));
    }
    
}
