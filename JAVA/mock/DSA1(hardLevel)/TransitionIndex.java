public class TransitionIndex {
    
    public static int transition(int[] arr, int end){
        int start = 0;
        if(arr[start] != arr[end]) {
            while(start < end) {
                int mid = start + (end - start) / 2;
                if(arr[mid] != arr[mid - 1]) {
                    return mid;
                }
                else if(arr[mid] == arr[start]) {
                    start = mid;
                }
                else {
                    end = mid;
                }
            }
        }
        return -1;
       
        
    }
    public static void main(String[] args) {
        int[] arr = new int[] {0, 0, 0, 1, 1, 1, 1};
        int result = transition(arr, arr.length - 1);
        System.out.println("the transition index is: " + result);
    }
}
