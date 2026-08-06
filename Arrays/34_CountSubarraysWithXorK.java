class Solution{
    public static int subarraysCount(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        int xor= 0;
        int count = 0;
        
        for(int num:nums){
            xor ^= num;
            int needed = xor ^ k;
            
            count += map.getOrDefault(0,needed);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }
}

T.C = O(n)
S.C = O(n)
