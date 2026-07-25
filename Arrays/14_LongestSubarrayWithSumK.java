import java.util.HashMap;

public class Main {

    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            // Calculate prefix sum
            prefixSum += arr[i];

            // Case 1: Subarray starts from index 0
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case 2: Check if (prefixSum - k) exists
            int remaining = prefixSum - k;

            if (map.containsKey(remaining)) {
                int currentLen = i - map.get(remaining);
                maxLen = Math.max(maxLen, currentLen);
            }

            // Store only the first occurrence of prefixSum
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;

        System.out.println(longestSubarray(arr, k));
    }
}
