class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        
        // Outer loop fixes the starting index of the substring
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            
            // Inner loop extends the substring to the right
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                
                int max = getMax(freq);
                int min = getMin(freq);
                
                ans += (max - min);
            }
        }
        return ans;
    }
    
    // Helper method to find the maximum frequency
    private int getMax(int[] freq) {
        int max = Integer.MIN_VALUE;
        for (int count : freq) {
            max = Math.max(count, max);
        }
        return max;
    }
    
    // Helper method to find the minimum frequency (ignoring characters with 0 frequency)
    private int getMin(int[] freq) {
        int min = Integer.MAX_VALUE;
        for (int count : freq) {
            if (count > 0) {
                min = Math.min(count, min);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}