class Solution {
    public String longestPalindrome(String s) {
        if(s== null || s.length() == 0){
            return "";
        }
        int start = 0;
        int maxLength = 1;
        for(int i=0;i<s.length();i++){
            int len1 = expandAroundCenter(s,i,i);
            if(len1 > maxLength){
                maxLength = len1;
                start = i-(len1-1)/2;
            }

            int len2 = expandAroundCenter(s,i,i+1);
            if(len2 > maxLength){
                maxLength = len2;
                start = i-(len2-1)/2;
            }
        }
        return s.substring(start,start+maxLength);
    }
    private int expandAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}

Time = O(n^2)
Space = O(1)
