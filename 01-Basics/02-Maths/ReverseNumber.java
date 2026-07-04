2) Reverse Digits in a Number
Code:
class Main{
    public static int reverseNumber(int num){
        if(num == 0)
           return 0;
           
        num = Math.abs(num);
        
        int rev =0;
        while(num > 0){
            int digit = num % 10;
            rev = rev*10+digit;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args){
        int num = 12345;
        System.out.print(reverseNumber(num));
    }
}
