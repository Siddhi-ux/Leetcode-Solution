class Solution {
    public static void moveZeroes(int[] nums) {
        int insertpos = 0 ;
        for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[insertpos] =nums[i];
            insertpos++;
        }
        }
        while(insertpos<nums.length){
            nums[insertpos++] = 0;
        }
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int insertpos =sc.nextInt();
        
        int[] nums= new int[insertpos];
        for(int i=0;i<insertpos;i++){
            nums[i] =sc.nextInt();
        }
        moveZeroes(nums);
        
    }
}
