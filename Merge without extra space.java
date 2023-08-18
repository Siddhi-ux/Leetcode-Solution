class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l =m-1;
        int r=0;
        while(l >0 && r<n){
            
            if(nums1[l]>nums2[r] ){
                if(nums1[l] !=0 && nums2[r] !=0){
                int temp =nums1[l];
                nums1[l]=nums2[r];
                nums2[r] = temp;
                }
                l--;
                r++;
                
            }else{
                break;
            }

        }
        int i = 0;
        for (int num : nums1) {
            if (num != 0) {
                nums1[i++] = num;
            }
        }
        
        for (int num : nums2) {
            if (num != 0) {
                nums1[i++] = num;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        
    }
}
