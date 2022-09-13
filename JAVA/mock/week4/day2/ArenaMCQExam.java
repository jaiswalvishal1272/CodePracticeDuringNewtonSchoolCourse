import java.util.Scanner;

public class ArenaMCQExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int p = sc.nextInt();
        if(res <= p) res = p;
        int q = sc.nextInt();
        if(res <= q) res = q;
        int r = sc.nextInt();
        if(res <= r) res = r;
        int s = sc.nextInt();
        if(res <= s) res = s;
        
        System.out.println(res);
        sc.close();
    }
}