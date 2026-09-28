import java.util.*;
class Main{
    public static int sumOfFrequenices(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int minFrequency = Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
            }
            if(entry.getValue() < minFrequency){
                minFrequency = entry.getValue();
            }
        }
        return maxFrequency+minFrequency;
    }
    public static void main(String[] args){
        int[] nums = {1,2,2,3,3,3,4,4};
        System.out.print(sumOfFrequenices(nums));
    }
}