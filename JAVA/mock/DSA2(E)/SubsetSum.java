import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[] {2, 3, 4, 5, 6, 7, 8};
        // for(int i = 0; i < arr.length - 1; i++) {
        //     for(int j = i + 1; j < arr.length; j++) {
        //         if(arr[i] + arr[j] == k) {
        //             System.out.print("(" + arr[i] + ", " + arr[j] + ")" + " ");
        //         }
        //     }
        // }
        Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
            sumMap.put(i,arr[i]);
        }
        for(int i = 0; i < arr.length; i++) {
            int a = k - arr[i];
            if(sumMap.containsKey(a)){
                System.out.print("(" + arr[i] + ", " + sumMap.get(a) + ")" + " ");
            }
        }
        sc.close();
    }
}
