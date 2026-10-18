class Solution {
    public int firstUniqChar(String s) {
        
        int[] frequency = new int[26];
        int length = s.length();
        
    
        for (int i = 0; i < length; i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        
        
        for (int i = 0; i < length; i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i; 
            }
        }
        
        
        return -1;
    }
}
