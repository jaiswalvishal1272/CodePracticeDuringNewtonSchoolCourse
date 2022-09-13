import java.util.*;
public class SortAndMerge {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 5, 8, 15 };
        int[] arr2 = new int[] {2, 3, 9, 10, 25};
        merge(arr1, arr2);
    }
    public static void merge(int[] arr1, int[] arr2) {
        int lengthOfNewArray = arr1.length + arr2.length;
        int j = 0, k = 0;
        int[] arr = new int[lengthOfNewArray];
        for(int i = 0; i < lengthOfNewArray; i++) {
            if(j < arr1.length && k < arr2.length){
                if(arr1[j] <= arr2[k]) {
                    arr[i] = arr1[j];
                    j++;
                }
                else{
                    arr[i] = arr2[k];
                    k++;
                }
            }
            else {
                if(j < arr1.length) {
                    arr[i] = arr1[j];
                    j++;
                }
                if(k < arr2.length) {
                    arr[i] = arr2[k];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
