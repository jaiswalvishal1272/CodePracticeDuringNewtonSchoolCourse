public class RepeatingElementIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7};
        int repeatingStartIndex = 0, repeatingEndIndex = 0;
        int count = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                if(count == 0) {
                    repeatingStartIndex = i;
                }
                count++;
            }
        }
        repeatingEndIndex = repeatingStartIndex + count - 1;
        System.out.println("Start index of repeating element: " + repeatingStartIndex + " , Last index of repeating element: " + repeatingEndIndex);
    }
}