Q) Maximum Nesting Depth of the Parentheses

class Solution {
    public static int maxDepth(String s) {
        int level = 0;
        int maxLevel = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                level++;
            }else if(ch == ')'){
                level--;
            }else{
                continue;
            }
            maxLevel = Math.max(level,maxLevel);
        }
        return maxLevel;
    }

Time : O(n)
Space : O(1)