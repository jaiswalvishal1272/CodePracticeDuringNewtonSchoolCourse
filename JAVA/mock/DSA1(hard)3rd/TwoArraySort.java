public class TwoArraySort {
    public static int[] implementSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            implementSort(arr, start, mid);
            implementSort(arr, mid + 1, end);
            merger(arr, start, mid, end);

        }
        return arr;
    }
    public static void merger(int[] arr, int start, int mid, int end){
        int[] newArr = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        
        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                newArr[k] = arr[i];
                i++;
            }
            else {
                newArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid) {
            newArr[k] = arr[i];
            i++;
            k++;
        }
        while(j <= end) {
            newArr[k] = arr[j];
            j++;
            k++;

        }
        k = 0;
        for(i = start; i < end; i++) {
            arr[i] = newArr[k];
            k++;
        }
    }
    public static void mergerTwoArray(int[] x, int[] y) {
        int len1 = x.length;
        int len2 = y.length;
        int[] jointArr = new int[len1 + len2 - 1];
        int i = 0, j = 0, k = 0;
        while(i < len1 && j < len2) {
            if(x[i] < y[j]){
                jointArr[k] = x[i];
                i++;

            }
            else {
                jointArr[k] = y[j];
                j++;

            }
            k++;
            while(i < len1) {
                jointArr[k] = x[i];
                i++;
                k++;

            }
            while(j < len2) {
                jointArr[k] = y[j];
                j++;
                k++;
            }
        
        }
    }

    public static void main(String[] args) {
        int[] x = new int[] {1, 4, 7, 8, 10};
        int[] y = new int[] { 2, 3, 9 };
        x = implementSort(x, 0, x.length);
        y = implementSort(x, 0, x.length);
        mergerTwoArray(x, y);
    }
}
/*
Array, Sorting: Given two sorted arrays, X[] and Y[] of size m and n each, 
merge elements of X[] with elements of array Y[] by maintaining the sorted order,
 i.e., fill X[] with the first m smallest elements and fill Y[] with remaining elements.
Input:
X[] = { 1, 4, 7, 8, 10 }
Y[] = { 2, 3, 9 }
 
Output:
X[] = { 1, 2, 3, 4, 7 }
Y[] = { 8, 9, 10 }
*/