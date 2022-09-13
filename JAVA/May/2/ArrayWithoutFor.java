import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithoutFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int[] arr = new int[n];
        while(i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
