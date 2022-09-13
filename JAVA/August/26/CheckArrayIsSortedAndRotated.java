/*
 * Find the Given Array is sorted and rotated clockwise or not.
 * 
 */

public class CheckArrayIsSortedAndRotated {

    public boolean checkAscending(int[] arr) {
        int n = arr.length;
        int changeCount = 0;
        int changeIdx = -1;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                changeCount++;
                changeIdx = i + 1;

            }
        }
        //if(changeCount == 1) {
        if(changeCount == 1 && arr[changeIdx] < arr[0]) {
            return true;
        }
        return false;
    }

    public boolean checkDescending(int[] arr) {
        int n = arr.length;
        int changeCount = 0;
        int changeIdx = -1;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                changeCount++;
                changeIdx = i + 1;
            }
        }
        //if(changeCount == 1) {
        if(changeCount == 1 && arr[changeIdx] > arr[0]) {
            return true;
        }
        return false;
    }

    public boolean checkArray(int[] arr) {
        // int n = arr.length;
        // int changeCount = 0;
        // for(int i = 0; i < n - 1; i++) {
        //     if(arr[i] > arr[i + 1]) {
        //         changeCount++;
        //     }
        // }
        // if(changeCount == 1) {
        //     return true;
        // }
        // return false;
        //if(check1.checkAscending(arr) || check1.checkDescending(arr)) {
        if(checkAscending(arr) || checkDescending(arr)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 2};
        CheckArrayIsSortedAndRotated check1 = new CheckArrayIsSortedAndRotated();
        boolean flag = check1.checkArray(arr);
        if(flag) {
            System.out.println("The given array is sorted and rotated clockwise.");
        }
        else {
            System.out.println("The given array is not a sorted and rotated clockwise.");
        }
    }
}