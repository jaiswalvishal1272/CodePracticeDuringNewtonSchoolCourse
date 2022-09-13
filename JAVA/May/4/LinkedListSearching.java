import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSearching {

    public static int search(LinkedListSearching head, int k) {

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == 7) {
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();

        int result = search(list, 7);
        System.out.println(result);
        // for(int i = 0; i < n; i++) {
        //     if(list.get(i) == 7) {
        //         System.out.println(i);
        //         break;
        //     }
        // }
        
    }
    
}
