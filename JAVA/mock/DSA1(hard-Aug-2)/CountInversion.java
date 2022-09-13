public class CountInversion {

    public static int merge(int[] arr, int start, int mid, int end) {
        int length = end - start + 1;
        int[] temp = new int[length];
        int countMerge = 0;
        int i = 0;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end) {
            if(temp[i] <= temp[j]) {
                temp[k] = temp[i];
                i++;
                countMerge++;
            }
            else {
                temp[k] = temp[j];
                j++;
                countMerge++;
            }
            k++;
        }
        while(i <= mid) {
            temp[k] = temp[i];
            i++;
            k++;
            countMerge++;

        }
        while(j <= end) {
            temp[k] = temp[j];
            j++;
            k++;
            countMerge++;
        }
        return countMerge;
    }

    public static int invCount(int[] arr, int start, int end) {
        int count = 0;
        if(start < end) {
            int mid = start + (end - start) / 2;
            count = count + invCount(arr, start, mid);
            count = count + invCount(arr, mid, end);
            count = count + merge(arr, start, mid, end);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {8, 4, 2, 1};
        int result = invCount(arr, 0, arr.length - 1);
        System.out.println(result);
    }
}
