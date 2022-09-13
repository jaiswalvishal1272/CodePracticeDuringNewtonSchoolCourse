import java.util.Scanner;

public class CandyWaysAssignment {

private long ways(long n, long a, long b) {
    long noOfSubarray = 0, count = 0;
    for( long k = 1; k <= n; k++) {
        if( k != a && k != b){
            System.out.println(k + " " + a + " " + b);
            noOfSubarray = n - k + 1;
            count = count + noOfSubarray;
        }
    }
    return count;
}
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CandyWaysAssignment obj = new CandyWaysAssignment();

        /*
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        */
        long n = 4;
        long a = 2;
        long b = 4;

        sc.close();
        
        long result = obj.ways(n, a, b);

        System.out.println(result);
    }
}
