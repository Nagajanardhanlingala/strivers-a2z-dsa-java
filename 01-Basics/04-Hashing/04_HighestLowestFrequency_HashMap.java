Q) Find the Highest/Lowest Frequency Element(Using Hash Map)

Code:
import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        int[] arr = {10, 5, 10, 15, 10, 5};

        // Step 1: Store frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Initialize variables
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = -1;
        int minElement = -1;

        // Step 3: Traverse the HashMap
        for (int key : map.keySet()) {

            int freq = map.get(key);

            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = key;
            }

            if (freq < minFreq) {
                minFreq = freq;
                minElement = key;
            }
        }

        // Step 4: Print answers
        System.out.println("Maximum Frequency Element: " + maxElement + " -> " + maxFreq);
        System.out.println("Minimum Frequency Element: " + minElement + " -> " + minFreq);
    }
}
