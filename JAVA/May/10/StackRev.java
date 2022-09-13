import java.util.Stack;

public class StackRev {

    // copy the value from first stack to second value
    public static void cloneStack(Stack<Integer> st, Stack<Integer> stcpy) {
        if(st.isEmpty()) {
            return;
        }
        int top = st.pop();
        cloneStack(st, stcpy);
        stcpy.push(top);
        st.push(top);
    }

    // put topmost element at bottom
    public static void pushAtBottom(Stack<Integer> st, int x ) {
        if(st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    // basic reverse function for stack
    public static void reverse(Stack<Integer> st)  {
        if(st.isEmpty()) {
            return;
        }

        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stcpy = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        cloneStack(st, stcpy);

        while(!stcpy.isEmpty()) {
            System.out.print(+ stcpy.peek() + " ");
            stcpy.pop();
        }

        System.out.println();
        reverse(st);

        while(!st.isEmpty()) {
            System.out.print(+ st.peek() + " ");
            st.pop();
        }
    }
}
