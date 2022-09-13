import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word:");
        String word = sc.nextLine();

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("no. of vowels: "+count);
        sc.close();
    }
    
}
