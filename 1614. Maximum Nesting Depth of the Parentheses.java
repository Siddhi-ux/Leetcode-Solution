class Solution {
    public int maxDepth(String s) {
        int depth =0;
        int curr=0;
        for(char c: s.toCharArray()){
            
            if(c== '('){
                curr++;
                depth =Math.max(depth,curr);
            }else if(c== ')'){
                curr--;
            }
        }
        return depth;
    }
}
