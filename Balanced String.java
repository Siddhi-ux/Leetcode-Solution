class Solution {
    public int balancedStringSplit(String s) {
        int cR=0,cL=0,count=0;
        for(int i:s.toCharArray())
        {
            if( i== 'R' )
                cR++;
                
            else if( i=='L' )
                cL++;
                
            if(cR==cL)
            {
                count++;
                cR=0;cL=0;
            }   
        }
        return count;
    }
}
