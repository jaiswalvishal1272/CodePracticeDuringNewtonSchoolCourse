// import java.util.Arrays;
import java.util.Scanner;

public class InversionCount {
  

private static int mergeSort(int[] arr, int start, int mid, int end) {

    int[] newArr = new int[end - start + 1];
    int  i = start, j = mid + 1;
    int k = 0;
    int count = 0;

    while(i <= mid && j <= end) {
        if(arr[i] <= arr[j]) {
            newArr[k] = arr[i];
            i++;
        }
        else {
            newArr[k] = arr[j];
            j++;
            count++;
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
    for(i = start; i <= end; i++) {
        arr[i] = newArr[k];
        k++;
    }
    return count;
}

private int implementMergeSort(int[] arr, int start, int end) {
    int result = 0;
    int count = 0;
    if(start < end) {
        int mid = start + (end - start) / 2;
        implementMergeSort(arr, start, mid);
        implementMergeSort(arr, mid + 1, end);
        result = mergeSort(arr, start, mid, end);
        count = count + result;
    }
    
return count;
}

    public static void main(String[] args) {
        InversionCount obj1 = new InversionCount();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // int result = obj1.implementMergeSort(arr, 0, n - 1);
        count = obj1.implementMergeSort(arr, 0, n - 1);
        System.out.println(count);

        sc.close();
    }
    
}
