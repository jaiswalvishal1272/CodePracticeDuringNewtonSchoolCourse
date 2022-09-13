import java.util.Scanner;

public class PrimeNumber {

    public static boolean checkPrime(int n) {
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k: ");
        int k = sc.nextInt();
        for(int i = 1; i <= k; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
