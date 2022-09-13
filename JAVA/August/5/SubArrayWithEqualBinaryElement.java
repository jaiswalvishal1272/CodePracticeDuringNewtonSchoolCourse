import java.util.*;

public class SubArrayWithEqualBinaryElement {

    public static int subArrayWithEqualNumberOfBinaryElement(int[] arr, int n) {
        Map<Integer, Integer> binaryMap = new HashMap<>();
        int sum = 0, count = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i] == 0 ? -1 : arr[i];
            if(sum == 0) {
                count++;
            }
            if(binaryMap.containsKey(sum)) {
                count += binaryMap.get(sum);
                binaryMap.put(sum, binaryMap.get(sum) + 1);
            }
            else {
                binaryMap.put(sum, 1);
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 0, 1, 0};
        int n = arr.length;
        int count = subArrayWithEqualNumberOfBinaryElement(arr, n);
        System.out.println("Number of SubArray is : " + count);
    }
}
