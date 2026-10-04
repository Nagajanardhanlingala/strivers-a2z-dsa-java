class Solution {
    public boolean checkValidString(String s) {
        int minBalance = 0;
        int maxBalance = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                minBalance++;
                maxBalance++;
            }else if(s.charAt(i) == '*'){
                minBalance--;
                maxBalance++;
            }else{
                minBalance--;
                maxBalance--;
            }
            minBalance = Math.max(0,minBalance);
            if(maxBalance < 0){
                return false;
            }
        }
        return minBalance == 0;
    }
}