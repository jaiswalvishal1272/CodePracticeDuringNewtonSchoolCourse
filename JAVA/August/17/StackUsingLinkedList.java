public class StackUsingLinkedList {

    // Creating LinkedList by Node class
    static class Node {
        int data;
        Node next;

        // Allocating the memory by using making the constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Creating the Stack using Stack class
    static class Stack {

        // Declear the list element in stack
        Node head;

        // Creating a function to check whether the stack is empty or not
        public boolean isEmpty() {
            return head == null;
        }

        // Creating a function to add the new element in stack
        public void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // creating a function to remove the element 
        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Creating a function to view the first or top element in stack
        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);

        while(!stk.isEmpty()) {
            System.out.print(stk.pop() + "=>");
        }
        System.out.print("null");
    }
}
