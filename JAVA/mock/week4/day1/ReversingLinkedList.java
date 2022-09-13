public class ReversingLinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node (int d) {
            data = d;
            next = null;

        }
    }
    Node reverve (Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
        return head;
    }
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ReversingLinkedList list = new ReversingLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked List");
        list.printlist(head);
        head = list.reverve(head);
        System.out.println();
        System.out.println("Reversed Linked List");
        list.printList(head);
    }
    
}
