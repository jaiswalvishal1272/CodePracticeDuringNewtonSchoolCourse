public class AddjusentTarget {

    public static int findTargetElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] > target) {
                if(arr[mid + 1] == target) {
                    return mid + 1;
                }
                end = mid;
                

            }
            else {
                if(arr[mid - 1] == target) {
                    return mid - 1;
                }
                start = mid;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7, 4, 20, 9, 26};
        int targetElement = 7;
        int index = findTargetElement(arr, targetElement);
        System.out.println(index);
    }
}
