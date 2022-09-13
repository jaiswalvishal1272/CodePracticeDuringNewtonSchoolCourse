import java.util.HashMap;
import java.util.Map;

public class BasicHashmapPractice {
    public static void main(String[] args) {
        int[] input = {23, 19, 14, 19, 5, 7, 5, 23, 19};
        //int duplicates = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for(int eachInput : input) {
            int frequency;
            if(frequencyMap.containsKey(eachInput)) {
                frequency = frequencyMap.get(eachInput);
                frequency = frequency + 1;
                //duplicates++;
            }
            else {
                frequency = 1;

            }
            frequencyMap.put(eachInput, frequency);
        }
        /*
         * key          value
         * 23           2
         * 19           3
         * 14           1
         * 5            2
         * 7            1
         */


        int majEle = 0;// 19
        int maxFreq = 0;// 3
        for(int freq : frequencyMap.keySet()) {
            if(frequencyMap.get(freq) > maxFreq) {
                maxFreq = frequencyMap.get(freq);
                majEle = freq;
            }
        }
        
        //System.out.println("No of Duplicates : "+duplicates);
        System.out.println("Frequency Map : " + frequencyMap);
        System.out.println("Majority Element : " + majEle);
    }


}
