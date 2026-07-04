3) Palindrome Number
Code:
class Main {
    public static int reverseNumber(int num) {

        if(num == 0)
           return 0;

        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

    public static void palindromeCheck(int num){
        int original = num;
        int rev = reverseNumber(num);

        if(rev == original){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }

    public static void main(String[] args){
        int num = 121;
        palindromeCheck(num);
    }
}
