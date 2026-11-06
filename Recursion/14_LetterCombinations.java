import java.util.ArrayList;
import java.util.List;

public class Solution {
    // Mapping of digits to corresponding telephone keypad letters
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Edge case: if the input is empty, return an empty list
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        
        // Kick off the backtracking process starting at index 0
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        // Base case: if the current combination length equals the digits length, we found a valid combination
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get the letters that the current digit maps to
        char digit = digits.charAt(index);
        String letters = KEYPAD[digit - '0'];

        // Iterate through all possible letters for this digit
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));          // Choose
            backtrack(digits, index + 1, current, result); // Explore
            current.deleteCharAt(current.length() - 1); // Unchoose (Backtrack)
        }
    }
}
