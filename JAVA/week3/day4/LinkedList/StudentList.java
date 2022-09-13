import java.util.Scanner;

public class StudentList {
    Student head;   // the default value of the head is null
    Student tail;

    public static void main(String[] args) {
        StudentList sList = new StudentList();
        Scanner sc = new Scanner(System.in);
        System.out.println("give the value of n : ");
        int n = sc.nextInt();
        String sName;
        // int sName;
        for( int i = 0; i < n; i++) {
            System.out.println("write the student name :");
            sName = sc.next();
            // sName = sc.nextInt();
            sList.addStudent(sName);
        }
        sList.printList();
        sc.close();

        /*
        sList.addStudent("Aman");
        sList.addStudent("Piyush");
        sList.addStudent("Raunak");
        sList.printList();
        */
    }
    // where we are adding the node at beginning or at end or at middle
    void addStudent(String name) {
        Student curr = new Student(name, null); // one new student is created
        if(head == null) {  // is he the first student
            head = curr;    // points the first student by head
        }
        else {
            // where we should insert the student
            // we will insert him at the beginning
            curr.addNextStudent(head);  // curr.next = head; // new student point to the previous student
            head = curr;     // head stop points to previous student and start points to new student
        }
    }    
    void addStudentAtEnd(String name) {
        Student curr = new Student(name, null);
        if (head == null) {
            head = curr;
            tail = curr;
        }
        else {
            tail.next = curr;
            tail = curr;
        }
    }
    void printList() {
        Student curr = head;
        while ( curr != null) {
            curr.print();
            curr = curr.next;
        }
    }
}
