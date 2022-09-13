import java.util.*;
public class ContinuousKill {
    private static int survivor(int n, int k) {
        if(n == 1) {
            return 0;
        }
        return (survivor(n-1, k) + k) % n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of testcases.
        while (t-- > 0) {
            int n = sc.nextInt(); // Total 'n' number of persons involved in the game.
            int k = sc.nextInt(); // 'kth' number person is killed.
            System.out.println(survivor(n, k) + 1);
        }
        
        sc.close();
    }
}
