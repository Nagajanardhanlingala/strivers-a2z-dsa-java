class Main{
    public static int findMissingElement(int [] arr){
        int n = arr.length + 1;
        int sum = 0;
        int expectedSum = n*(n+1) / 2;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return expectedSum - sum;
    }
    
    public static void main(String[] args){
        int [] arr ={1,2,3,4,7,5,8};
        int missingElement = findMissingElement(arr);
        System.out.print("Missing Element is: "+missingElement);
    }
}
