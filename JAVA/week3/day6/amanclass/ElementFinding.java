package amanclass;

import java.util.*;

public class ElementFinding {

    private int arraySum(int[] arr, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementFinding obj1 = new ElementFinding();

        System.out.println("Enter");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = obj1.arraySum(arr, n);
        System.out.println("Sum : " + result);
    }
}
