import java.util.*;

class StringFilter {


    public static String filter(String str, String[] arr) {
        HashSet<String> h = new HashSet<String>();
        for(String word: arr) {
            //System.out.println(word);
             h.add(word);
        }
        String result = " ";
        for(String s: str.split(" ")) {
            if(!h.contains(s)) {
                result = result + " " + s;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "my name is vishal and i am a coder";
        String[] arr = new String[] {"my", "is", "and"};
        String result = filter(str, arr);
        System.out.println(result);
    }
}

// name vishal i am a coder