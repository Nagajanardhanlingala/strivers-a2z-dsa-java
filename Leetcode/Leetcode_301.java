class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> result = new ArrayList<>();

        removeInvalid(s,result,0,0,new char[]{'(', ')'});
        return result;
    }

    private void removeInvalid(
        String s,
        List<String> result,
        int scanStart,
        int removeStart,
        char[] pair
    ) {

        int balance = 0;

        // Find the first position where the string becomes invalid
        for (int i = scanStart; i < s.length(); i++) {

            if (s.charAt(i) == pair[0]) {
                balance++;
            }

            if (s.charAt(i) == pair[1]) {
                balance--;
            }

            // String became invalid
            if (balance < 0) {
                for (int j = removeStart; j <= i; j++) {

                    // Skip duplicate removals
                    if (s.charAt(j) == pair[1]&& (j == removeStart|| s.charAt(j - 1) != pair[1])) {
                        String next = s.substring(0, j)+ s.substring(j + 1);
                        removeInvalid(next,result,i,j,pair);
                    }
                }
                return;
            }
        }
        
        String reversed = new StringBuilder(s).reverse().toString();

        if (pair[0] == '(') {
            removeInvalid(reversed,result,0,0,new char[]{')', '('});
        } else {
            result.add(reversed);
        }
    }
}