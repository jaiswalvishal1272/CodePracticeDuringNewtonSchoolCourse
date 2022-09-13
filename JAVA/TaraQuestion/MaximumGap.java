// Leetcode #164;
// Find out maximum gap between two successive elements of array in its sorted form

import java.util.Arrays;

public class MaximumGap {

    public static int maxGap(int[] arr) {
        int arrLength = arr.length;
        if(arrLength <= 1) {
            return 0;
        }
        Arrays.sort(arr);
        int diff = 0;
        int maxDiff = 0;
        for(int i = 1; i < arrLength; i++) {
            diff = arr[i] - arr[i - 1];
            if(diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{10};
        int result = maxGap(arr);
        System.out.println(result);
    }
}
