2)Find the Highest/Lowest Frequency Element (Using Hash Array)

Input:
arr[] = {10,5,10,15,10,5}

Output:
10 -> 3
15 -> 1

Code:
class Main{
    public static void main(String[] args){
        int [] arr = {10,5,10,15,10,5};
        int n = arr.length;
        int max=0;
        for(int i=0;i<n;i++){                 //finding max element in array
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        
        int [] hash = new int[max+1];
        for(int i=0;i <n;i++){               // creating new hash array of max limit
            hash[arr[i]] += 1;
        }
        
        
        int maxElement = -1;
        int maxFreq = 0;
        for(int i=0;i<= max;i++){             // finding max frequency and its key value
            if(hash[i] >0 && hash[i] > maxFreq){
                maxFreq = hash[i];
                maxElement = i;
            }
        }
        System.out.println(maxElement+" "+maxFreq);
        
        
        int minElement = -1;
        int minFreq = Integer.MAX_VALUE;
        for(int i=0;i<= max;i++){              // finding min frequency and its key value
            if(hash[i] >0 && hash[i] < minFreq){
                minFreq = hash[i];
                minElement = i;
            }
        }
        System.out.println(minElement+" "+minFreq);
    }
}
