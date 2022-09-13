import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] arr, int start, int mid, int end) {
        int length1 = mid - start + 1;
        int length2 = end - mid;
        int length = length1 + length2;
        int[] temp = new int[length];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        i = start;
        for(k = 0; k < length; k++) {
            arr[i] = temp[k];
            i++;
        }
        return arr;
        
    }
    public static int[] divide(int[] arr, int start, int end) {
        while(start < end) {
            int mid = start + (end - start) / 2;
            arr = divide(arr, start, mid);
            arr = divide(arr, mid + 1, end);
            arr = merge(arr, start, mid, end);

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 6};
        arr = divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
