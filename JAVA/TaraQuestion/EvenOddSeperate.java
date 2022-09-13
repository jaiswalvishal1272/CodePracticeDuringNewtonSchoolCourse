import java.util.Arrays;
class EvenOddSeperate {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 6, 2, 7, 3, 9, 8, 4};
        int n = arr.length;
        int[] temp = new int[n];
        int i = 0, j = n - 1;
        for(int num: arr) {
            if(num % 2 == 0) {
                temp[i] = num;
                i++;
            }
            else {
                temp[j] = num;
                j--;
            }
       }
        System.out.println(Arrays.toString(temp));
        
    }
}