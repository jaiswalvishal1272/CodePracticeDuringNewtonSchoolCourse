public class LongestSubSequence {

    public static int longestSubSequenceOfIntArr(int[] arr, int n) {
        int sum = 0;
        int length;
        int maxEle = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(maxEle < arr[i]) {
                maxEle = arr[i];
            }
        }
        int maxSum = (maxEle * (maxEle + 1)) / 2;
        int missing = maxSum - sum;
        if((maxEle - missing) > missing) {
            length = maxEle - missing;
        }
        else {
            length = missing - 1;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,9,3,10,4,20,2 };
        int n = arr.length;
        int length = longestSubSequenceOfIntArr(arr, n);
        System.out.println("Length of longest SubSequence is : " + length);
    }
}
