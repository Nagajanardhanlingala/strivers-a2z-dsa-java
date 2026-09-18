Q) Sort Characters by Frequency

HashMap approach

class Solution{
    public String frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Entry<Character,Integer>> freqList =new ArrayList<>(map.entrySet());
        
        freqList.sort((a, b) -> b.getValue() - a.getValue());
        
        StringBuilder result = new StringBuilder();
        for(Entry<Character,Integer> entry : freqList){
            char ch = entry.getKey();
            int frequency = entry.getValue();
            
            for(int i=0;i<frequency;i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}


Bucket Sort Approach

import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Frequency buckets
        List<Character>[] bucket = new List[s.length() + 1];

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int frequency = entry.getValue();

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(ch);
        }

        // Build result from highest frequency to lowest
        StringBuilder result = new StringBuilder();

        for (int i = bucket.length - 1; i >= 1; i--) {
            if (bucket[i] == null) {
                continue;
            }

            for (char ch : bucket[i]) {
                for (int j = 0; j < i; j++) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}

Time : O(n + k)
Space: O(n + k)