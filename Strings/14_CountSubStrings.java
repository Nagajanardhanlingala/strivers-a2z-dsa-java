class Solution {
    public long countSubstrings(String s) {
        int mask = 0;
        long answer = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);

        for(int i=0;i<s.length();i++){
            int bit = s.charAt(i)-'a';
            mask = mask^(1 << bit);
            answer += freq.getOrDefault(mask,0);

            for(int j=0;j<10;j++){
                int newMask = mask^(1 << j);
                answer += freq.getOrDefault(newMask,0);
            }
            freq.put(mask, freq.getOrDefault(mask, 0) + 1);
        }
        return answer;
    }
}

Time:  O(10n) → O(n)
Space: O(n)