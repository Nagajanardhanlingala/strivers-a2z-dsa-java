class Solution{
    public int minOperations(String s){
        int n = s.length();
        
        if(isSorted(s)) return 0;
        
        if(n == 2) return -1;
        
        char low = min_char(s);
        char high = max_char(s);
        
        if(s.charAt(0) == low || s.charAt(n-1) == high) return 1;
        
        for(int i=1;i<n-1;i++){
            if(s.charAt(i) == low || s.charAt(i) == high){
                return 2;
            }
        }
        return 3;
    }
    private char min_char(String s){
        char minChar = Character.MAX_VALUE;
        
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            
            if(current < minChar){
                minChar = current;
            }
        }
        return minChar;
    }
    
    private char max_char(String s){
        char maxChar = Character.MIN_VALUE;
        
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(current > maxChar){
                maxChar = current;
            }
        }
        return maxChar;
    }
    
    private boolean isSorted(String s){
        boolean sorted = true;
        for(int i=0;i<s.length()-1;i++){
            char current = s.charAt(i);
            char next = s.charAt(i+1);
            
            if(next < current){
                sorted = false;
            }
        }
        return sorted;
    }
    
}