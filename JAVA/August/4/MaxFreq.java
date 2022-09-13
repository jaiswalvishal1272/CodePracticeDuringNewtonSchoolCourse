import java.util.*;
import java.util.Map.Entry;

public class MaxFreq {

    public static int checkMaxFreq(int[] arr) {
        int maxF = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int input : arr) {
            int freq;
            
            if(map.containsKey(input)) {
                freq = map.get(input);
                freq += 1;
            }
            else {
                freq = 1;
            }
            if(freq > maxF) {
                maxF = freq;
            }
            map.put(input, freq);
        }
        for(Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == maxF) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10, 15, 10, 15, 15};
        int maxFreq = checkMaxFreq(arr);
        System.out.println(maxFreq);
    }
}
