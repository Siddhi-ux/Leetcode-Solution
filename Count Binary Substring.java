class Solution {
    public int countBinarySubstrings(String s) {
        int c=0,i=1,prev=0,curr=1;
        while(i<s.length()){
            if(s.charAt(i-1) != s.charAt(i)){
                c+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }else{
                curr++;
            }
            i++;
        }
        return c+=Math.min(prev,curr);
    }
}
