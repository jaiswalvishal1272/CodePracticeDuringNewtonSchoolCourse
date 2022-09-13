import java.util.Arrays;

public class ElementInSortedArray {

    /**
     * @param arr
     * @param target
     * @return
     */
    public static int[] searchRange(int[] arr, int target) {
        int start = 0;
        int first = -1;
        int last = -1;
        int end = arr.length;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                first = checkFirst(arr, mid);
                last = checkLast(arr, mid);
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return [first, last];
    }
    public static int checkFirst(int[] arr, int end) {
        for(int i = end; i > 0; i--) {
            if(arr[i] != arr[i - 1]){
                return i;
            }
        }
        return 0;
    }
    public static int checkLast(int[] arr, int start) {
        for(int i = start; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                return i;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {5,7,7,8,8,10};
        int target = 8;
        int[] temp = searchRange(arr, target);
        System.out.println(Arrays.toString(temp));
    }
}
