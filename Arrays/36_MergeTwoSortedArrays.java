class Solution {
    public void merge(int[] nums1,int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int len = n1+n2;
        int gap = (len+1) / 2;
        
        while(gap > 0){
            int left = 0;
            int right = left+gap;
            
            while(right < len){
                int val1 = (left < n1) ? nums1[left] : nums2[left-n1];
                int val2 = (right < n1) ? nums1[right] : nums2[right-n1];
            
                if(val1 > val2){   
                    if(left < n1 && right < n1){
                    int temp = nums1[left];
                    nums1[left] = nums1[right];
                    nums1[right] = temp;
                }else if(left < n1 && right >= n1){
                    int temp = nums1[left];
                    nums1[left] = nums1[right-n1];
                    nums1[right-n1] = temp;
                }else{
                    int temp = nums2[left - n1];
                    nums2[left - n1] = nums2[right - n1];
                    nums2[right - n1] = temp;
                }
                }
            left++;
            right++;
            }
            if(gap == 1){
            break;
        }
        gap = (gap+1)/2;
        }
    }
}

Time:  O((n + m) log(n + m))
Space: O(1)
