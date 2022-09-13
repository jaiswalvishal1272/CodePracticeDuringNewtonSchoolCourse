import java.util.*;

// import java.util.Stack;
public class PalindromString {

    // public static void compBottom(int data, Stack<Integer> st) {
    //     if(st.isEmpty()){
    //         return;
    //     }
    //     int top = st.pop();
    //     compBottom(data, s);
    //     if(data == top)
    // }

    public static void reverse(Stack<String> st) {
        if(st.isEmpty()){
            return;
        }
        String top = st.pop();
        reverse(st);
        st.push(top);
        //compBottom(top, st);
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        // String str = "abcdef";


        
        Stack<String> st = new Stack<>();
        // for(int i = 0; i < str.length(); i++) {
        //     st.push(str.charAt(i));
        // }

        st.push("a");
        st.push("b");
        st.push("c");

        reverse(st);
    }
}
