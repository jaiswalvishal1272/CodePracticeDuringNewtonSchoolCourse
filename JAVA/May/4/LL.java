import java.util.LinkedList;

public class LL {
    /*
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }
    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last;
    public void addFirst(String data) {
        Node newNode = new Node(data);
        // size++;
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        // size++;
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;
        
    }
    public void printList() {
        if(head == null) {
            System.out.println("This is a Empty LinkedList.");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;

        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Nothing to delete here");
            return;
        }
        // Node currNode = head;
        // currNode.next = head;
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Nothing to delete here");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }
    */

    public static void main(String[] args) {
        /*
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        System.out.println(list.getSize());

        list.addLast("list");
        list.printList();
        System.out.println(list.getSize());

        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());

        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        */

        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("this");
        System.out.println(list);
        System.out.println(list.size());

        list.addLast("is");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());

        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());

    }
}
