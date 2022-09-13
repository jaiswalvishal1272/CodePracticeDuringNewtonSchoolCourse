import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    
        public static void main(String[] args) {
            int[] arr = new int[] {1, 5, 4, 2, 3};
            int n = arr.length;
            int sum = 5;
            print( arr, n, sum);
        }
        static void print(int[] arr, int n, int sum) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i = 0; i < n; i++) {
                int r = sum - arr[i];
                if(map.containsKey(r));
                {
                    int count = map.get(r);
                    for(int j = 0; j < count; j++){
                        System.out.println(r +" " +arr[i]);
                    }

                }
                if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i])+1);

                }
                else{
                    map.put(arr[i], 1);
                }
            }
        }
    
}