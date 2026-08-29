public static int shipWithinDays(int[] weights,int days){
        int maxWeight = weights[0];
        int sum=0;
        for(int weight : weights){
            sum += weight;
            
            if(weight > maxWeight){
                maxWeight = weight;
            }
        }
        int low = maxWeight;
        int high = sum;
        while(low <= high){
            int mid = low+(high-low)/2;
            int requiredDays = calculateDays(weights,mid);
            if(requiredDays <= days){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public static int calculateDays(int[] weights,int capacity){
        int currentLoad = 0;
        int daysUsed = 1;
        for(int weight : weights){
            if(currentLoad+weight <= capacity){
                currentLoad += weight;
            }else{
                daysUsed++;
                currentLoad = weight;
            }
        }
        return daysUsed;
    }

T.C = O(N log S)
S.C = O(1)
