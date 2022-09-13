import java.util.*;
public class SquareSortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int left = 0, right = n-1, idx = n-1;
            int[] ans = new int[n];
            while (left <= right) {
                if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                    ans[idx] = arr[left] * arr[left];
                    left++;
                }
                else {
                    ans[idx] = arr[right] * arr[right];
                    right--;
                }
                idx--;
            }
            for (int i : ans) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
