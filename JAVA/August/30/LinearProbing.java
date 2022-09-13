import java.util.*;
class LinearProbing {
    public static void makeTable(int[] arr, int n, int l) {
        Map<Integer, Integer> table = new HashMap<>();
        for(int i = 0; i < l; i++) {
            table.put(i, -1);
        }
        for(int i = 0; i < n; i++) {
            int key = arr[i] % l;
            
            while(table.containsKey(key) && rtable.get(key) != -1) {
                key++;
            }
            table.put(key, arr[i]);
        }
        for(int k = 0; k < l; k++) {
            System.out.print(table.get(k) + " ");
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //while(t > 0) {
        for(int k = 1; k <= t; k++) {
            int l = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            makeTable(arr, n, l);
            //System.out.println();
           // t--;
        }
        sc.close();
    }
}