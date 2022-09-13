import java.util.Scanner;

public class DistributingMoney {

    public static int distribution(long x, long y, long z, long k) {
        
        long xy = Math.abs(x-y);
        long xz = Math.abs(x-z);
        long yz = Math.abs(y-z);
        long diff1 = Math.min(xy,xz);
        long diff2 = Math.min(diff1, yz );
        long sum = xy + xz + yz - diff2;
        long xyz =k - sum;
        if(xyz == 0) {
            return 1;
        }
        else if(xyz > 0){
            if(xyz%3 == 0) {
                return 1;
            }
        }
        return 0;

       



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long k = sc.nextLong();
        int result = distribution(x, y, z, k);
        System.out.println(result);
        sc.close();
    }
}
