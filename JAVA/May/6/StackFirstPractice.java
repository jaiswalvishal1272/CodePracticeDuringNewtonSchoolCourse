import java.util.*;

public class StackFirstPractice {

    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void print(Stack<Integer> x) {
        while(!x.isEmpty()) {
            System.out.print(x.peek() + " ");
            x.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        print(s);
        // pushAtBottom(4, s);
        reverse(s);

        print(s);
        // while(!s.isEmpty()) {
        //     System.out.print(s.peek() + " ");
        //     s.pop();
        // }
    }
}
