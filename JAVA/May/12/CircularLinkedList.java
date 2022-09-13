public class CircularLinkedList {
    
    // LinkedList class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    // add funtion
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

    public void remove() {
        if(head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null) {
            last = curr.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null; 
    }

}
