import java.util.*;
public class NewtonKeppler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int product = n-1;
		int[] w = new int[m];
		for(int i = 0; i < m; i++) {
			w[i] = sc.nextInt();
			product = product * w[i];
		}
		System.out.println(product);
		sc.close();
    }
}
