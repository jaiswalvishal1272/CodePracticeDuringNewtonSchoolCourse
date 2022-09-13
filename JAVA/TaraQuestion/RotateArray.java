// Leetcode #189
// Rotate the given array k no of times
import java.util.*;

public class RotateArray {

    public static void rotate(int[] arr, int k) {
        int length = arr.length;
        while (k > 0) {
            int temp = arr[0];
            for(int i = 0; i < length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[length - 1] = temp;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        rotate(arr, k);
        sc.close();
    }
}
