import java.util.*;
public class EasySortAlphabat {

    // public static boolean check(char ch1, char ch2) {
    //     if(ch1 > ch2 ) {
    //         return true;
    //     }
    //     return false;
    // }
/*
    public static void conqur(String[] arr, int startIdx, int midIdx, int endIdx) {
        int i = startIdx;
        int j = midIdx + 1;
        int k = 0;
        String[] str = new String[endIdx - startIdx + 1];
        while(i <= midIdx && j <= endIdx) {
            if(arr[i].charAt(0) < arr[j].charAt(0)) {
                str[k] = arr[i];
                i++;
            }
            else {
                str[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= midIdx) {
            str[k] = arr[i];
            i++;
            k++;
        }
        while(j <= endIdx) {
            str[k] = arr[j];
            j++;
            k++;
        }
        for(k = 0, i = 0; i < endIdx; i++, k++) {
            arr[i] = str[k];
        }

    }

    public static void divide(String[] arr, int startIdx, int endIdx) {
        if(startIdx >= endIdx) {
            return;
        }
        int midIdx = startIdx + ((endIdx - startIdx) / 2);
        divide(arr, startIdx, midIdx);
        divide(arr, midIdx + 1, endIdx);
        conqur(arr, startIdx, midIdx, endIdx);
    }
*/
    public static void main(String[] args) {
        String[] arr = new String[] {"AS", "KF", "ER", "DD", "JK"};
        // char ch1 = 'q';
        // char ch2 = 'r';
        //System.out.println(check(ch1, ch2));
        //divide(arr, 0, arr.length);
        System.out.println(Arrays.toString);
    }
}
