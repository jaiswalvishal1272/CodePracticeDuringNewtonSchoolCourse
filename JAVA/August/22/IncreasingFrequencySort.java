import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
class IncreasingFrequencySort {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        Comparator<Integer> comp=(a,b)->{
            if(map.get(a)!=map.get(b))
                return map.get(a)-map.get(b);
            else
                return b-a;
        };
        
         Integer[] ans = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        Arrays.sort(ans,comp);
        for(int i=0;i<nums.length;i++){
            nums[i] = ans[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }
}