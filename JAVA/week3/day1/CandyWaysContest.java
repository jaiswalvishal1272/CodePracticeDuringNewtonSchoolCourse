import java.util.Scanner;

public class CandyWaysContest {
    /*
    static int count = 0;
    static void subset (int[] arr, int arrSize, int startIndex, int sizeOfSubset, int numberOfElementTaken) {
        if (numberOfElementTaken == sizeOfSubset) {
            count++;
            return;
        }
        if (startIndex == arrSize) {
            return;
        }
        subset(arr, arrSize, startIndex + 1, sizeOfSubset, numberOfElementTaken + 1);
        subset(arr, arrSize, startIndex + 1, sizeOfSubset, numberOfElementTaken);
        */
        static int count = 0;
    static void subset (int arrSize, int startIndex, int sizeOfSubset, int numberOfElementTaken) {
        if (numberOfElementTaken == sizeOfSubset) {
            count++;
            return;
        }
        if (startIndex == arrSize) {
            return;
        }
        subset(arrSize, startIndex + 1, sizeOfSubset, numberOfElementTaken + 1);
        subset(arrSize, startIndex + 1, sizeOfSubset, numberOfElementTaken);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = new int[n];
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i != a && i != b) {
                // subset(arr, n, 0, i, 0);
                subset(n, 0, i, 0);
            }
        }
        sc.close();
        System.out.println(count % 1000000007);
    }
}
