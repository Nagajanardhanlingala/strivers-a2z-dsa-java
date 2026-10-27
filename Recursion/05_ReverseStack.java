class Solution {
    public void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st,top);   
    }

    static void insertAtBottom(Stack<Integer> stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack,element);
        stack.push(top);
    }
}