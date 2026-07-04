6)Print all Divisors of a given Number

Code:

import java.util.*;
class Main{
    public static List<Integer> getDivisors(int n){
        List<Integer> res = new ArrayList<>();
        for(int i=1;i*i <= n;i++){
            if(n%i ==0){
              res.add(i);
            if(i != n/i){
              res.add(n/i);
            }
            }
            
        }
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args){
        int n = 30;
        System.out.print(getDivisors(n));
        
    }
}