import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean isPalindrome(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        return s.equals(s2);
    }

    void getAllParts(String s, List<String> current, List<List<String>> result) {
        if (s.length() == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String part = s.substring(0, i + 1);
            if (isPalindrome(part)) {
                current.add(part);
                getAllParts(s.substring(i + 1), current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        getAllParts(s, current, result);
        return result;
    }
}
