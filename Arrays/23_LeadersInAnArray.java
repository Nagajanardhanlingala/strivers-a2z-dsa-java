class Main{
    public static ArrayList<Integer> arrayLeaders(int[] nums){
        int n = nums.length;
        int maxRight = nums[n-1];
        ArrayList<Integer> result = new ArrayList<>();
        
        result.add(maxRight);
        
        for(int i=n-2;i>=0;i--){
            if(nums[i] > maxRight){
                maxRight = nums[i];
                result.add(maxRight);
            }
        }
        //Collections.reverse(result);
        //return result;
        return reverse(result,0,result.size()-1);
    }
    
    public static ArrayList<Integer> reverse(ArrayList<Integer>result,int start,int end){
        while(start < end){
            int temp = result.get(start);
            result.set(start,result.get(end));
            result.set(end,temp);
            
            start++;
            end--;
        }
        return result;
    }
}