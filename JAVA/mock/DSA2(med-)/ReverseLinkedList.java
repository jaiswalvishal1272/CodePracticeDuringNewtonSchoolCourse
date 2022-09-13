import java.util.LinkedList;

class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
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
    public void reverse() {
        if(head == null || head.next == null) {
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while(curr.next != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;

        }
        head.next = null;
        head = prev;


    }
    public void printList() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();
        list.reverse();
        list.printList();

    }
    
}


public int element(int k){
    int index = size() - k + 1;
    Node curr = head;
    for(int i = 0; i < index; i++) {
        curr = curr.next;
    }
    return curr;
}
