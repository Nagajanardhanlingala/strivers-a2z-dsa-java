1) Count the Digits in a Number

Code:

class Main{
    public static int countDigits(int num){
        if(num ==0)
          return 1;
        num = Math.abs(num);
        
        int count = 0;
        
        while(num > 0){
            int digit = num % 10;
            count ++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args){
        int num = 12345;
        System.out.print(countDigits(num));
    }
}