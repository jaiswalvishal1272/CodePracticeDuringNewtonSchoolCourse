import java.util.*;
public class BubbleSort {
    public static int[] sort(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 3, 2, 4};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
