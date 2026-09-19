class Solution {
    public boolean checkIfPangram(String sentence) {

        if (sentence.length() < 26) {
            return false;
        }

        int seen = 0;
        for (int i = 0; i < sentence.length(); i++) {
        
            int bitIndex = sentence.charAt(i) - 'a';
            seen |= (1 << bitIndex);
        }

        return seen == ((1 << 26) - 1);
    }
}
