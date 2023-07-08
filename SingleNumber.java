class Solution {
    public static int singleNumber(int[] nums) {
        int res =0;
        for(int num : nums){
            res ^=num;

        }
        return res;

        
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        int s = singleNumber( nums);
        System.out.println(s);
    }
}
