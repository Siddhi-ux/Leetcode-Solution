class Solution
{
    public boolean isGood(int[] nums) 
    {
        int m = Integer.MIN_VALUE;
        for(int i : nums)
        {
          m = Math.max(m,i);
        }
        int a[] = new int[m+1];
        a[m] = m;
        a[m-1] = m;
        for(int i = 0; i < m-1;i++)
        {
            a[i] = i+1;
        }
        if(a.length != nums.length)
            return false;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length;i++)
         {
            if(a[i] != nums[i])
                return false;
               // System.out.print(a[i]);
        }
        return true;
    }
}
