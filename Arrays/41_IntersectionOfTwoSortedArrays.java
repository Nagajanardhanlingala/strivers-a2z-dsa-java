import java.util.*;
class Main{
    public static int[] intersectionArray(int[] nums1, int[] nums2){
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] ans = new int[result.size()];
        for(int k=0;k<result.size();k++){
            ans[k]=result.get(k);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,2,3,4};
        int[] nums2 = {1,2,7};
        int[] result = intersectionArray(nums1,nums2);
        
        System.out.println(Arrays.toString(result).replace(" ",""));
    }
}

Time = O(n + m)
Space = O(k)