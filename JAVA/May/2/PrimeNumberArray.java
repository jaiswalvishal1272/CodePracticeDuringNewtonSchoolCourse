import java.util.Scanner;

/**
 * PrimeNumberArray
 */
public class PrimeNumberArray {

    public static int primeSum(int[] primeArr, int l, int r) {
        int sum = 0;
        for(int i = l - 1; i < r; i++) {
            sum = sum + primeArr[i];
        }
        return sum;
    }

    public static boolean checkPrime(int j) {
        for(int k = 2; k * k <= j; k++) {
            if(j % k == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int[] primeArr = new int[n];
        int i = n;
        for(int j = 2; i > 0; j++) {
            if(checkPrime(j)) {
                primeArr[n - i] = j;
                i--;
            }
        }
        int result = primeSum(primeArr, l, n);
        System.out.println(result);
        sc.close();
    }
}