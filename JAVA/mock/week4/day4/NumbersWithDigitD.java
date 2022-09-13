/*
Given two integers 'n' and 'd', your task is to find the numbers between 1 to 'n',
 which contains the digit 'd' at least 1 time.
Constraints:- 
1 <= n < 100000
1 <= d <= 9
*/

import java.util.Scanner;

public class NumbersWithDigitD {

    private static boolean digitPresent(int d, int n) {
        
    }

    private void numbers(int n, int d) {
        for(int i = 1; i <= n; i++) {
            if(digitPresent(i,d)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumbersWithDigitD obj1 = new NumbersWithDigitD();
        
        System.out.println("enter the peak value:");
        int n = sc.nextInt();
        System.out.println("enter the digit d:");
        int d = sc.nextInt();
        
        sc.close();

        obj1.numbers(n, d);
    }
}
