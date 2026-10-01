class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(stack.isEmpty() || !match(stack.pop(),ch)){
                return false;
            }
        }
        return stack.isEmpty();
    }
    private boolean match(char a, char b){
        return(a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
}