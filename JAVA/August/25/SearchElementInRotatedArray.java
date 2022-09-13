/*
 * Find the index of key element 'k' present in the sorted and rotated array.
 * 
 */

import java.util.*;

public class SearchElementInRotatedArray {

    public static int searchInArray(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(key == arr[mid]) {
                return mid;
            }
            else if(key < arr[mid] && key < arr[start]) {
                start = mid + 1;
            }
            else {
                end = end - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 5, 6, 1, 2};
        int key = 1;
        int keyIndex = searchInArray(arr, key);
        if(keyIndex == -1) {
            System.out.println("key: " + key + " is not present in the array " + Arrays.toString(arr));
        }
        else {
            System.out.println("Index of key in the array is: " + keyIndex);
        }
    }
}
