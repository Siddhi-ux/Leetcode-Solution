class Solution {
    public int maxPower(String s) {
        int maxl =1;
        int currl =1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currl++;
                maxl =Math.max(maxl,currl);
            }else{
                currl =1;
            }
        }
        return maxl;
    }
}
