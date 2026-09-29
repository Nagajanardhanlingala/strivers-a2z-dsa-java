class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        if(s.size() <= 1){
            return s;
        }
        char first = s.remove(0);
        reverseString(s);
        s.add(first);
        return s;
    }
}
