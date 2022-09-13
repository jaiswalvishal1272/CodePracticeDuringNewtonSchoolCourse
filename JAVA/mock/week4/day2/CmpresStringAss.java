import java.util.Scanner;

public class CmpresStringAss {

    private void calDup(String str1) {
        
    }

    public static void main(String[] args) {
        CmpresStringAss obj1 = new CmpresStringAss();
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            String str1 = sc.next();
            obj1.calDup(str1);
        }
        sc.close();
    }
}
