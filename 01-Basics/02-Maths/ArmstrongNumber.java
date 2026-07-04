5) Armstrong Number

Code:

class Main{
    public static int countDigits(int num){
        if(num == 0)
           return 1;
           
        num = Math.abs(num);
        int digits = 0;
        while(num > 0){
            int digit = num % 10;
            digits ++;
            num = num / 10;
        }
        return digits;
    }
    public static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        int digits = countDigits(num);
        while(num > 0){
            int digit = num % 10;
            sum += (int) (Math.pow(digit,digits));
            num = num /10;
        }
        return sum == original;
        
    }
    public static void main(String[] args){
        int num = 153;
        System.out.println(isArmstrong(num));
    }
}