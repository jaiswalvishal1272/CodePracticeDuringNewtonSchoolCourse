import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GroupAnagram {

    public static List<List<String>> anagram(String[] strs) {
        char[] array;
        List<String> list;
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String str: strs) {
            array = str.toCharArray();
            Arrays.sort(array);
            String temp = String.valueOf(array);
            if(anagramMap.containsKey(temp)){
                anagramMap.get(temp).add(str);
            }
            else {
                list = new ArrayList<>();
                list.add(str);
                anagramMap.put(temp, list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> value : anagramMap.values()){
            result.add(value);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = anagram(strs);
        for(List<String> list : ans) {
            for(String str : list) {
                System.out.println(str + " , ");
            }
            System.out.println();
    }

    }
}
