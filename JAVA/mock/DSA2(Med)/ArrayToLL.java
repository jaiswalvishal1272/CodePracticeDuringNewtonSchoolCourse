import java.util.Arrays;

// import java.util.*;
public class ArrayToLL {
    
    class Node {
        int data;
        Node next;
        //Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            //this.prev = null;

        }

        public void print() {
        }
    }
     Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;


    }
    public void print() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;

        }
        System.out.print("null");
    }

    public int peek(int index) {
        Node curr = head;
        while(index-- > 0) {
            curr = curr.next;
        }
        return curr.data;
    }

    public static void main(String[] args) {
        
        
        ArrayToLL list = new ArrayToLL();
        int[] arr = new int[] {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.print();

        int[] arrRev = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arrRev[i] = list.peek(arr.length - 1 - i);
        }
        System.out.println();
        System.out.println(Arrays.toString(arrRev));

        /*
        list.add(1);
        list.add(2);
        list.print();
        */
    }

}
