import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        
        for (String op : operations) {
            switch (op) {
                case "+":

                    int topScore = scores.pop();
                    int secondLastScore = scores.peek();
                    int newScore = topScore + secondLastScore;
                    
                    scores.push(topScore);
                    scores.push(newScore); 
                    break;
                    
                case "D":
                    scores.push(scores.peek() * 2);
                    break;
                    
                case "C":
                    scores.pop();
                    break;
                    
                default:
                    scores.push(Integer.parseInt(op));
                    break;
            }
        }
        int totalSum = 0;
        for (int score : scores) {
            totalSum += score;
        }
        
        return totalSum;
    }
}
