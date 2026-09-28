class Main{
    public int secondMostFrequentElement(int[] nums){
        int maxFrequency = 0;
        int secondFrequency = -1;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
            int element = entry.getKey();
            int frequency = entry.getValue();
            
            if(frequency > maxFrequency){
                secondFrequency = maxFrequency;
                maxFrequency = frequency;
                
            }else if(frequency < maxFrequency && frequency > secondFrequency){
                secondFrequency = frequency;
            }
        }
        if (secondFrequency == -1) {
            return -1;
        }
        
        int secondElement = Integer.MAX_VALUE;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int frequency = entry.getValue();
            int element = entry.getKey();
            
            if(frequency == secondFrequency){
                secondElement = Math.min(secondElement,element);
            }
        }
        return secondElement;
    }
}
