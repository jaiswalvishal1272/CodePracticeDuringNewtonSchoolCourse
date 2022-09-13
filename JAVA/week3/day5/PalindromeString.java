import java.util.Scanner;

public class PalindromeString {
    private void checkPalindrome(String str1) {
        int n = str1.length();
        boolean flag = true;
        for (int i = 0; i < n / 2; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str1.charAt(n - 1 - i);
            if(ch1 != ch2) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void main(String[] args) {
        PalindromeString obj1 = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str1 = sc.next();
        obj1.checkPalindrome(str1);
        sc.close();
    }
}
