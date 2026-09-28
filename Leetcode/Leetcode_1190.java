class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] pair = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else if(s.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    int open = stack.pop();

                    pair[i]=open;
                    pair[open]=i;
                }
            }
        }
        int i=0;
        int direction = 1;
        StringBuilder answer = new StringBuilder();
        while(i < n && i >= 0){
            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                i=pair[i];
                direction = -direction;
            }else{
                answer.append(s.charAt(i));
            }
            i += direction;
        }
        return answer.toString();
    }
}

-------------------------------------------------------------------------------------------
Time = O(n^2) approach

import java.util.*;
class Main{
    public static String reverseParentheses(String s){
        StringBuilder current = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder reverse = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(new StringBuilder(current));
            }else if(s.charAt(i) == ')'){
                reverse= reverse(current);
                current = stack.pop().append(reverse);
            }else{
                current.append(s.charAt(i));
            }
        }
        return current.toString();
    }
    public static StringBuilder reverse(StringBuilder current){
        StringBuilder answer = new StringBuilder();
        for(int i=current.length()-1;i>=0;i--){
            answer.append(current.charAt(i));
        }
        return answer;
    }
    public static void main(String[] args){
        String s = "(ed(et(oc))el)";
        System.out.print(reverseParentheses(s));
    }
}