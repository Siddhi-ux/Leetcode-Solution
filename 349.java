class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int r=0;
        int len=nums2.length;
        int arr[] =new int[Math.min(len,n)];
        
        boolean [] s=new boolean[1000];
        for(int i:nums1){s[i]=true;}
        for(int i:nums2){
            if(s[i]){
                arr[r]=i;
                r++;
                s[i]=false;
            }
        }
        return Arrays.copyOfRange(arr,0,r);
    }
}
