import java.util.*;

class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array ");
        int n = sc.nextInt();
        System.out.println("target sum ");
        int targetsum = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("array element is  ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = sumTwoNum(arr, targetsum);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    public static int[] sumTwoNum(int[] arr, int t) {
        int[] res = new int[2];
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length-1; j++) {
                if(arr[i] + arr[j] == t){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}