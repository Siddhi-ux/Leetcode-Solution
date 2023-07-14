class Solution {
    public static  int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid =l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] nums=new int[l];
        int target =sc.nextInt();
        for(int i=0;i<l;i++){
            nums[i] =sc.nextInt();
        }
        int u= searchInsert( nums,target);
    }
}
