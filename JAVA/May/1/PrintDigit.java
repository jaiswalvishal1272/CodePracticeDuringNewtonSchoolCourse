import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {

        Map<Integer, String> digitMap = new HashMap<Integer, String>();
        digitMap.put(0, "Zero");
        digitMap.put(1, "One");
        digitMap.put(2, "Two");
        digitMap.put(3, "Three");
        digitMap.put(4, "Four");
        digitMap.put(5, "Five");
        digitMap.put(6, "Six");
        digitMap.put(7, "Seven");
        digitMap.put(8, "Eight");
        digitMap.put(9, "Nine");
        
        Scanner sc = new Scanner(System.in);
        String str;
        int n = sc.nextInt();
        do {
            int count = 0;
            int x = n % 10;
            n = n / 10;
            
                str = digitMap.get(x);
            
            if(count > 0) {
                if(digitMap.containsKey(x)) {
                    // str = str + digitMap.get(x);
                    str = str.concat(digitMap.get(x));
                    System.out.println(str);
                }
            }
            count++;
        }
        while(n > 0);
        sc.close();
    }
}
// 1024 > one Zero Two Four