class Main{
    public int secondMostFrequentElement(int[] nums){
        int maxFrequency = 0;
        int maxElement = Integer.MAX_VALUE;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
            int element = entry.getKey();
            int frequency = entry.getValue();
            
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                maxElement = element;
            }else if(frequency == maxFrequency && element < maxElement){
                maxElement = element;
            }
        }
        return maxElement;
    }
}