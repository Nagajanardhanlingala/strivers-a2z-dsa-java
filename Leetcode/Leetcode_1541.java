class Solution {
    public int minInsertions(String s) {
        int neededRight = 0; 
        int ans = 0;         

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (neededRight % 2 == 1) {
                    ans++;
                    neededRight--;
                }
                neededRight += 2; 
            } else { 
                neededRight--;
                if (neededRight < 0) {
                    ans++;             
                    neededRight += 2;  
                }
            }
        }
        return ans + neededRight;
    }
}
