import java.util.Scanner;

public class QueueUsingLinkedList {
    
    // Creating the Linkedlist 
    static class Node {
        int data;
        Node next;

        // Allocating the memory to linkedlist by using constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Creating the class Queue
    static class Queue {

        // Define the reference pointer to the first node of linkedlist
        Node head;

        // Creating a function for check whether the queue is empty or not
        public boolean isEmpty() {
            return head == null;
        }

        // Creating a function to add the new element
        public void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        // Creating a function to remove the element from queue
        public int pull() {
            if(isEmpty()) {
                return -1;
            }
            int first = head.data;
            head = head.next;
            return first;
        }

        // Creating a function to view first element of queue
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    // Main function or Driver code
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of queue");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int data = sc.nextInt();
            q.add(data);
        }
        sc.close();
        while(!q.isEmpty()) {
            System.out.print(+ q.pull() + "=>");
        }
        System.out.print("null");

    }
}