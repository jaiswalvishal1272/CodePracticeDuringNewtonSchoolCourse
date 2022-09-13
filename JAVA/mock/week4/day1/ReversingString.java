import java.util.Scanner;

public class ReversingString {

    private static void reverseString(String str) {
        int len = str.length();
        char[] ch = new char[len];
        for(int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
        }
        for(int i = 0; i < len / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[len -1 -i];
            ch[len - 1 - i] = temp;
        }
        str = String.valueOf(ch);

        System.out.println(str);
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseString(str);
        sc.close();
    }
}
