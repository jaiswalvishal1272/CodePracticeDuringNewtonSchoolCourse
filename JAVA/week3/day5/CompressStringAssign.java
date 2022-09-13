import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompressStringAssign {

    private void compressString(String str1) {
        char[] ch = new char[str1.length()];
        Map<String, Integer> stringMap = new HashMap<String, Integer>();
        for(int i = 0; i < str1.length(); i++) {
            ch[i] = str1.charAt(i);
        }
        for (char eachCh : ch) {
            int frequency;
            if(stringMap.containsKey(eachCh)) {
                frequency = frequency.get(eachCh);
                frequency = frequency + 1;
            }
            else {
                frequency = 1;
            }
            stringMap.put(eachCh, frequency);
        }
        System.out.println("Map: " + stringMap);
    }
    public static void main(String[] args) {
        CompressStringAssign obj1 = new CompressStringAssign();
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            String str1 = sc.next();
            obj1.compressString(str1);

        }
        sc.close();
    }
}
