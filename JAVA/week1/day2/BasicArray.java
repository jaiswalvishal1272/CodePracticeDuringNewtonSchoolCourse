import java.util.*;

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the length of the Array: ");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Fill the elements of the Array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // for(int i = 0; i < n; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        sc.close();
    }
}
