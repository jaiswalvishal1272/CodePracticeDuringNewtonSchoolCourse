import java.util.*;

public class SortingAdjesant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sorting(arr, n);
        sc.close();
    }
    public static void sorting(int[] arr, int n) {
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for( int j = 1; j < n-i; j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[i];
                    arr[j] = temp;

                }
            }
        
        }
    }
    
}
