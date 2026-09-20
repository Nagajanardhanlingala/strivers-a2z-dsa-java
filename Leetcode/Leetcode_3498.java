class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int alphaIndex = 26-(s.charAt(i)-'a');
            degree = alphaIndex * (i+1);
            sum += degree;
        }
        return sum;
    }
}