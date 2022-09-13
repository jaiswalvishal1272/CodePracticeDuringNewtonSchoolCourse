public class MaxAndMin {

    public static int checkSecondMin(int[] arr, int n) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] < first) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }

    public static int checkSecondMax(int[] arr, int n) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 6, 6, 6, 7, 8, 9, 9, 9, 9};
        int n = arr.length;
        int secondMax = checkSecondMax(arr, n);
        int secondMin = checkSecondMin(arr, n);
        System.out.println("Second Minimum Element in the Array is: " + secondMin);
        System.out.println("Second Maximum Element in the Array is: " + secondMax);
    }
}