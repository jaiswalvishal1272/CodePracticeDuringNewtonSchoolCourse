public class Student {// this is one node / Element in the LinkedList
    String name;    // data
    Student next;   // reference to the next student or next node

    // this is the reference to instance of the student
    Student(String name, Student next) {
        this.name = name;
        this.next = next;
    }

    // to add the next student 
    void addNextStudent(Student next) {
        this.next = next;
    }

    // to print the this student
    void print() {
        System.out.println(this.name);
    }
}
