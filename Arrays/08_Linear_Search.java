class Main{
    public static int linearSearch(int [] arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int [] arr = {1,2,3,4,1,0,0};
        int num = 5;
        int index = linearSearch(arr,num);
        System.out.print(index);
    }
}
