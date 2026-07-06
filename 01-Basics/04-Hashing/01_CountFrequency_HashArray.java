1) Count Frequency of each element in an Array (Using Hash Array)

Input:
{10,5,10,15,10,5}

Output:
5  -> 2
10 -> 3
15 -> 1

Code:
class Main{
    public static void main(String[] args){
        int [] arr = {10,5,10,15,10,5};
        int n = arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        
        int [] hash = new int[max+1];
        for(int i=0;i <n;i++){
            hash[arr[i]] += 1;
        }
        for(int i=0;i<= max;i++){
            if(hash[i]>0)
              System.out.println(i+"->"+hash[i]);
        }
        
    }
}