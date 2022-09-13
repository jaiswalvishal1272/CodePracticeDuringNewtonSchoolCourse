import java.util.*;

public class MissingFirstPostiveInteger {
    public static void main(String[] args) {
        MissingFirstPostiveInteger obj = new MissingFirstPostiveInteger();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxEle = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        System.out.println(obj.missingNumber(arr, n, maxEle));
        sc.close();
        
    }
    private int missingNumber(int[] arr, int n, int maxEle) {
        int missingElement = 0;
        // for(int i = 1; i < maxEle; i++){
        //     for(int j = 0; j < n; j++) {
        //         if (arr[j] == i) {
        //             // missingElement = i;
        //             break;
        //         }
        //         else {
        //             missingElement = i;
        //         }
        //     }
            
        // }
        Arrays.sort(arr);
        for(int i = 1; i < maxEle; i++) {
            missingElement = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j] == i) {
                    missingElement = -1;
                    break;
                }
            }
            if(missingElement == 0) {
                missingElement = i;
                break;
            }
        }
        return missingElement;
    }
}
