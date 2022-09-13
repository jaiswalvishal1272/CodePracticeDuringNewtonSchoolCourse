
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(search(arr, 4));
    }
    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == key) {
               return mid;
            
            }
            else if(arr[mid] < key) {
                start = mid+1;
            }
            else {
                end = mid - 1;

            }
        }
        
         return -1;
    }
}
