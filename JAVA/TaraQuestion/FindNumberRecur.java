/*
 *
 */
public class FindNumberRecur {
    public static int numAndIdx(int[] arr, int start, int key) {
        if(start > arr.length) {
            return -1;
        }
        if(arr[start] == key) {
            return start;

        }
        start++;
        int idx = numAndIdx(arr, start, key);
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        int key = 3;
        int idx = numAndIdx(arr, 0, key);
        System.out.println("The index is: " + idx);
    }
}
