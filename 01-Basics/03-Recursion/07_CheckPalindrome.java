7)check if a string is Palindrome or not

Code:

class Main{
    public boolean isPalindrome(String str,int left,int right){
        
        if(left >= right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        
        return isPalindrome(str,left+1,right-1);
        
    }
    public static void main(String[] args){
        Main res = new Main();
        String str="abcd";
        int n = str.length();
        int left = 0;
        int right = n-1;
        System.out.print(res.isPalindrome(str,left,right));
    }
}