class Solution {
    public boolean isDivisibleBy9(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum += s.charAt(i) - '0';
        }
            return sum % 9 == 0;
  }
}