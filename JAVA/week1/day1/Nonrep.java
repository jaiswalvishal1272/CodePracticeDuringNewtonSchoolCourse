import java.util.*;
public class Nonrep {
    public static void main(String[] args) {
        int[] arr = getelement();
        System.out.print(Arrays.toString(arr));        
    }

    public static int[] getelement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("arr: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
}
