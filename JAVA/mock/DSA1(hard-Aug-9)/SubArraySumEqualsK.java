import java.util.Map;

public class SubArraySumEqualsK {

    public static int noOfSubArray(int[] arr, int n, int k) {
        Map<Integer, Integer> subMap = new HashMap<>();
        map.put(0,1)
        
        for(int i = 0; i < n; i++) {
           map.put(arr[i])
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        int length = arr.length;
        int k = 3;
        int count = noOfSubArray(arr, length, k);
        System.out.println("No. of SubArray is : " + count);
    }
}