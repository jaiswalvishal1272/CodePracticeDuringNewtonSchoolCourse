import java.util.Arrays;
import java.util.Scanner;


public class AnagramStrings {
    private static boolean areAnagram(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        char[] s1 = new char[n1];
        char[] s2 = new char[n2];

        if(n1 != n2) {
            return false;
        }
       
        for(int i = 0; i < n1; i++) {
            s1[i] = str1.charAt(i);
            s2[i] = str2.charAt(i);

        }

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i = 0; i < n1; i++) {
            if(s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if(areAnagram(str1, str2)){
            System.out.println("Both the strings are anagram to each other.");
        }
        else {
            System.out.println("Both the strings are not anagram to each other.");
        }
        sc.close();
    }
}
