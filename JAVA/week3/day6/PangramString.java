import java.util.Scanner;

public class PangramString {

private boolean checkPangram(String str1) {
    
    boolean[] mark = new boolean[26];

    int index = 0;

    for (int i = 0; i < str1.length(); i++) {
        System.out.println(str1.charAt(i));
        if ('A' <= str1.charAt(i) && str1.charAt(i) <= 'Z') {
            index = str1.charAt(i) - 'A';
        }
        else if ('a' <= str1.charAt(i) && str1.charAt(i) <= 'z') {
            index = str1.charAt(i) - 'a';
        }
        else {
            continue;
        }

        mark[index] = true;
    }

    for (int i = 0; i < 26; i++) {
        if (mark[i] == false) {
            return false;
        }
    }
    return true;

}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PangramString obj1 = new PangramString();

        System.out.println("Enter the Sentence: ");
        String str1 = sc.nextLine();

        if(obj1.checkPangram(str1) == true) {
            System.out.println(str1 + " is a pangram");
        }
        else {
            System.out.println(str1 + " is not a pangram");
        }

        sc.close();
    }
}
