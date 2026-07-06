Q) Count Frequency of each element in an Array (Using HashMap)


import java.util.HashMap;
class Main{
    public static void main(String[] args){
        int [] arr = {1,2,3,1,4,5,2,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
}
